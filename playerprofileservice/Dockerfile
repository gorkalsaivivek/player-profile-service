FROM openjdk:17
WORKDIR /opt
EXPOSE 1000
COPY target/*.jar /opt/app.jar
ENTRYPOINT exec java $JAVA_OPTS -jar app.jar
