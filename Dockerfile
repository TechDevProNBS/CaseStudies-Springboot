FROM openjdk:8
COPY target/group-spring-1.0.0.jar /
CMD java -jar group-spring-1.0.0.jar
