FROM ubuntu

RUN apt update \
        && apt install openjdk-17-jdk -y

COPY producer/build/libs/producer-0.0.1-SNAPSHOT.jar /home/producer-0.0.1-SNAPSHOT.jar
COPY consumer/build/libs/consumer-0.0.1-SNAPSHOT.jar /home/consumer-0.0.1-SNAPSHOT.jar

WORKDIR /home

CMD java -jar /home/producer-0.0.1-SNAPSHOT.jar & java -jar /home/consumer-0.0.1-SNAPSHOT.jar

EXPOSE 7000
EXPOSE 7001
