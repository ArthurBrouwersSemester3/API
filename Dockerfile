FROM openjdk:17-jdk-alpine3.13
COPY target/APIMaven-1.0.jar /app/
WORKDIR /app
ENV PORT=8080
EXPOSE 8080
CMD ["java", "-jar", "APIMaven-1.0.jar"]
