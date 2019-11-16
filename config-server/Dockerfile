
FROM openjdk:11.0-jdk-slim

WORKDIR /app

COPY target/*.jar .

EXPOSE 8761

CMD java -jar config-server.jar
