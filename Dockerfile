# Use official OpenJDK image
FROM openjdk:17

# Set working directory
WORKDIR /app

# Copy built JAR file from target folder (adjust based on your Maven build output)
COPY target/scientific-calculator-1.0-SNAPSHOT.jar app.jar


# Command to run the application
CMD ["java", "-jar", "app.jar"]
