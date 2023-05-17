# Base image with Java installed
FROM openjdk:17

# Set the working directory inside the container
WORKDIR /app

# Copy the compiled JAR file to the container
COPY target/APIMaven-1.0-SNAPSHOT.jar /app/APIMaven-1.0-SNAPSHOT.jar

# Set the port to 8080
ENV PORT=8080

# Expose the port
EXPOSE 8080

# Run the JAR file when the container starts
CMD ["java", "-jar", "APIMaven-1.0-SNAPSHOT.jar"]
