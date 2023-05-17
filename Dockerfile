# Base image with Java installed
FROM openjdk:17

# Set the working directory inside the container
WORKDIR /app

# Copy the compiled JAR file to the container
COPY . .

# Run the JAR file when the container starts
CMD ["java", "-jar", "APIMaven-1.0-SNAPSHOT.jar"]
