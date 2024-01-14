FROM openjdk:17-jdk-slim

WORKDIR /app

COPY target/flow-backend-0.0.1-SNAPSHOT.jar /app/flow-backend-0.0.1-SNAPSHOT.jar

EXPOSE 8080

# Command to run the application
CMD ["java", "-jar", "flow-backend-0.0.1-SNAPSHOT.jar"]
