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
cd /SpringTutorial/build/libs
java -jar {jar FILE}
```

## Mysql

```
docker run -d -p 3306:3306 -e MYSQL_ROOT_PASSWORD={password} --name {name} mysql --character-set-server=utf8mb4 --collation-server=utf8mb4_unicode_ci
mysql -u root -p
{password}
```