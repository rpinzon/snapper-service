# Start with a base image containing Java runtime
FROM openjdk:8-jdk-alpine

# Add Maintainer Info
LABEL maintainer="rpinzon@gmail.com"

# Add a volume pointing to /tmp
VOLUME /tmp

# Make port 8080 available to the world outside this container
EXPOSE 8080

# The application's jar file
ARG JAR_FILE=target/snapper-service-0.1.0-SNAPSHOT.jar

# Add the application's jar to the container
ADD ${JAR_FILE} snapper-service.jar

ENTRYPOINT ["java","-jar","/snapper-service.jar"]
