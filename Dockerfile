FROM openjdk:17-jdk-alpine3.13
WORKDIR /app

# Copy the source code
COPY . .

# Build the JAR file
RUN mvn clean install

# Copy the built JAR file to the container
COPY target/APIMaven-1.0.jar /app

# Set the working directory and the entry point
WORKDIR /app
CMD ["java", "-jar", "APIMaven-1.0.jar"]
