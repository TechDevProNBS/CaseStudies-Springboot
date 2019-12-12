pipeline {
    agent any
environment {
    VERSION = readMavenPom().getVersion()
    registry = "casestudiesnbs/spring-boot-backend"
    registryCredential = "76df3ed5-c60d-4d29-b6d8-f27e213139f8"
    dockerImage = ''
}
    stages {
	stage('test') {
	    steps {
		echo "no junit or intergration tests"
	    }
	}
        stage('Build') {
            steps {
		    sh 'mvn package -DskipTests'
		    script {
                     dockerImage = docker.build registry + ":$VERSION"
             }
            }
        }
        stage('Deploy') {
            steps {   
             script {
                    docker.withRegistry( '', registryCredential ) {
                      dockerImage.push()
            }
}
}
        }
        stage('Testing Environment') {
            steps {
                echo "API Tests not found"
            }
        }
        stage('Staging') {
          when{
              expression{
              env.BRANCH_NAME=='staging'
              }
          }
            steps {
                sh 'docker-compose pull'
                sh 'PROFILE=staging docker-compose up -d'
                sh 'mvn test -Dtest=SeleniumSuite'
            }
        }
        stage('Production') {
            steps {
                sh 'docker-compose down'
                script {
                    docker.withRegistry( '', registryCredential ) {
                      dockerImage.pull()
            } 
                sh 'docker-compose up -d'
                echo "Production started"
            }
        }
    }
}
}

