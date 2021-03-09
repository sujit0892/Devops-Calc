FROM openjdk:8
COPY ./target/calculator-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java", "-cp", "Devops-Calc-1.0-SNAPSHOT.jar", "Main"]