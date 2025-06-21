from ubuntu:latest as build

run apt update
run apt install openjdk-21-jdk -y
copy ..

run apt install maven -y
run mvn clean install

from openjdk:21-jdk-slim

expose 8080

copy --from=build /target/dieta-0.0.1-SNAPSHOT.jar app.jar

entrypoint ["java", "-jar", "app.jar"]