FROM openjdk:8
COPY target/group-spring.jar /
CMD java -jar group-spring.jar


