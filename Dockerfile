FROM openjdk:17
EXPOSE 8686
COPY target/*.jar devops-integration.jar
ENTRYPOINT ["java","-jar","/devops-integration.jar"]
