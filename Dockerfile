FROM eclipse-temurin:17

WORKDIR /app

COPY build/libs/TestProject-1.0-SNAPSHOT.jar app.jar

CMD ["java", "-jar", "app.jar"]