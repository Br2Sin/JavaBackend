FROM openjdk:8-jre-alpine

RUN mkdir -p /app

COPY target/calmisapp-1.0.0.jar /app/calmisapp-1.0.0.jar

WORKDIR /app

ENTRYPOINT exec java $JAVA_OPTS -jar calmisapp-1.0.0.jar
























