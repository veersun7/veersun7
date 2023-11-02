FROM openjdk:8
EXPOSE 8080 
ADD target/batch4dockerprj batch4dockerprj.jar
ENTRYPOINT ["java", "-jar", "/batch4dockerprj.jar"]
ARG JAR_FILE = target/*.jar
COPY $JAR_FILE batch4dockerprj.jar