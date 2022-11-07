FROM openjdk:11
LABEL maintainer="lovelazur@gmail.com"
EXPOSE 8080
ARG JAR_FILE=build/libs/shopx-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar", "--spring.profiles.active=prod"]

# docker stop shopx
# docker rmi shopx:latest
# docker build -t shopx .
# docker images
# docker run -p 8081:8080 shopx

