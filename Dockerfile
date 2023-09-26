# Use the official OpenJDK base image
FROM openjdk:11-jre-slim

# Set environment variables
ENV SERVER_IP=0.0.0.0
ENV SERVER_PORT=8085

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file into the container at the specified working directory
COPY target/billpro-0.0.1-SNAPSHOT.jar /app/app.jar

# Expose the port your application will run on (default is 8080)
EXPOSE ${SERVER_PORT}

# Define the command to run your Spring Boot application when the container starts
CMD ["java", "-jar", "app.jar", "--server.address=${SERVER_IP}", "--server.port=${SERVER_PORT}"]