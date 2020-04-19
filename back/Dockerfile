FROM java:openjdk-8u111-jdk
WORKDIR /opt
ADD target/back-*.jar back.jar
EXPOSE 8090
ENTRYPOINT ["java", "-jar", "/opt/back.jar"]
