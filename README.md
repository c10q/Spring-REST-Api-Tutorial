# Spring-REST-Api-Tutorial

## Docker

```
cd {pwd}
docker build -t spring_rest .
docker run -i -t --name spring_rest -p 80:80 -v {pwd}/SpringTutorial:/SpringTutorial spring_rest
```

## Build

```
docker exec -it spring_rest /bin/bash
cd /SpringTutorial
./gradlew
```

## Run Spring

```
java -jar {jar FILE}
```