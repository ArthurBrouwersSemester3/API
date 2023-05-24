FROM openjdk:17-jdk-alpine3.13
COPY target/APIMaven-1.0.jar /app/
WORKDIR /app
RUN mvn clean build
CMD ["java", "-jar", "APIMaven-1.0.jar"]
