FROM openjdk:8-jdk-alpine
LABEL maintainer="lakshanviranga@gmail.com"
VOLUME /main-app
ADD target/spring-mongodb-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]