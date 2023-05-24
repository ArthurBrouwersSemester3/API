FROM openjdk:17-jdk-alpine3.13
COPY target/APIMaven-1.0.jar /usr/app/
WORKDIR /usr/app
CMD ["java", "-jar", "APIMaven-1.0.jar"]
