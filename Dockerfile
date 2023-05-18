FROM openjdk:17-jdk

COPY target/royal-integeration.jar royal-integeration.jar

ENTRYPOINT ["java", "-jar", "/royal-integeration.jar"]