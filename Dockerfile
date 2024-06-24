FROM openjdk:17-jdk-alpine
COPY ./D387_sample_code-0.0.2-SNAPSHOT.jar target/D387_sample_code-0.0.2-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "D387_sample_code-0.0.2-SNAPSHOT.jar"]