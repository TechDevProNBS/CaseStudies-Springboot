pipeline {
    agent any
environment {
    VERSION = readMavenPom().getVersion()
    registry = "casestudiesnbs/spring-boot-backend"
    registryCredential = "dockerhub"
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
              env.BRANCH_NAME=='Staging'
              }
          }
            steps {
                sh 'sudo docker-compose pull'
                sh 'PROFILE=staging docker-compose up -d'
                sh 'mvn test -Dtest=SeleniumSuite'
            }
        }
        stage('Production') {
            when{
                expression{
                env.BRANCH_NAME=='Production'
                }
            }
            steps {
                sh 'sudo docker-compose pull'
                sh 'PROFILE=production sudo docker-compose up -d'
                echo "Production"
            }
        }
    }
}
