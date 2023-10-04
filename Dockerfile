# Use the official OpenJDK base image
FROM openjdk:18.0.2.1

# Set the working directory inside the container
WORKDIR /app

# Copy the compiled JAR file into the container at /app
COPY target/authjwt-0.0.1-SNAPSHOT.jar /app/authjwt-0.0.1-SNAPSHOT.jar

# Command to run the Java application
CMD ["java", "-jar", "authjwt-0.0.1-SNAPSHOT.jar"]
