FROM openjdk:8-jdk-alpine
MAINTAINER brijendra
COPY build/libs/store-0.0.1-SNAPSHOT.jar docker-store-app-1.0.0.jar
ENTRYPOINT ["java","-jar","/docker-store-app-1.0.0.jar"]