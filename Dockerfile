FROM openjdk:8-jdk-alpine
EXPOSE 5000
ADD target/dockerExample-0.0.1-SNAPSHOT.jar/app.jar
ENTRYPOINT ["java","-jar","app.jar"]
