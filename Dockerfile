FROM openjdk:8-jdk-alpine
VOLUME /tmp

ARG JAR_FILE
ADD target/${JAR_FILE} /app.jar

# TODO: 研究下这行代码的意义，没加这行会无法解析dns
RUN echo 'hosts: files mdns4_minimal [NOTFOUND=return] dns mdns4' >> /etc/nsswitch.conf

ENTRYPOI
NT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]