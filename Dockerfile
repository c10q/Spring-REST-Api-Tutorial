FROM ubuntu:18.04
MAINTAINER Kwanok Noh <cloq@kakao.com>

RUN apt-get update
RUN apt-get install -y openjdk-8-jdk


EXPOSE 80
EXPOSE 8080
EXPOSE 8081
EXPOSE 8082
EXPOSE 443
EXPOSE 6001