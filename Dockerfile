FROM eclipse-temurin:21.0.11_10-jdk

WORKDIR /app

COPY target/*.jar app.jar

EXPOSE 8081

ENTRYPOINT ["java","-jar","app.jar"]