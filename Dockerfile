FROM openjdk:8-jdk-alpine
LABEL maintainer="mamoudouba8787@gmail.com"
VOLUME /tmp
EXPOSE 8083
COPY build/libs/rewardcentral_api-1.0.0.jar rewardcentral.jar
ENTRYPOINT ["java","-jar","rewardcentral.jar"]