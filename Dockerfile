FROM openjdk:11-jdk-slim
MAINTAINER Chaturanand Yadav <chaturre@gmail.com>
ADD target/*.jar rewards-service.jar
EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/rewards-service.jar"]


