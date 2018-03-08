FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/spring-boot-mongo.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]