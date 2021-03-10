FROM openjdk:8-jdk-alpine
LABEL maintainer="mamoudouba8787@gmail.com"
VOLUME /tmp
EXPOSE 8083
COPY build/libs/rewardCentral_api-1.0.0.jar rewardCentral.jar
ENTRYPOINT ["java","-jar","rewardCentral.jar"]