# Spring-REST-Api-Tutorial

```
cd {pwd}
docker build -t spring_rest .
docker run -i -t --name spring_rest -p 80:8080-8082 -v {pwd}/SpringTutorial:/SpringTutorial spring_rest
docker exec -it spring_rest /bin/bash
```

build
```
docker exec -it spring_rest /bin/bash
cd /SpringTutorial
./gradlew
```
