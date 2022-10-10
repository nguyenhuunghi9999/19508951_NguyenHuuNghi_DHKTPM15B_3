# mvn clean package spring-boot:repackage
FROM openjdk:18-jre-slim
WORKDIR /usr/src/myapp
COPY target/Product_app.jar /usr/src/myapp/app.jar
EXPOSE 8080
CMD [ "java", "-jar", "/usr/src/myapp/app.jar" ]
