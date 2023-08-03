FROM ubuntu:23.04

SHELL ["/bin/bash", "-c"] 

RUN apt-get -y update && apt-get -y upgrade && \
    apt-get install -y openjdk-17-jdk curl && \
    curl https://raw.githubusercontent.com/creationix/nvm/master/install.sh | bash && \
    bash -i -c 'nvm install 18.17.0'