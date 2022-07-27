FROM openjdk:11
EXPOSE 8080
ADD target/spring-boot-service-locator.jar spring-boot-service-locator.jar
ENTRYPOINT ["java","-jar","/spring-boot-service-locator.jar"]