FROM openjdk:17
WORKDIR /app
COPY target/test-phonebook-0.0.1-SNAPSHOT.jar /app/test-phonebook.jar
ENTRYPOINT [ "java", "-jar", "/app/test-phonebook.jar" ]