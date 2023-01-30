# kotlin-spring-boot-rest-api
Kotlin Spring Boot REST API

From: https://proandroiddev.com/kotlin-spring-boot-building-a-rest-api-29598d39a392

Shows how to build a REST API with Kotlin and Spring Boot.

It retrieve Players information and uses a MySQL as database, with JPA and Hibernate to access data from the database.

# Installing MySQL / MariaDB an Debian

As root do:

```bash
# apt-get install mariadb-client mariadb-server
```

## Create dbplayers database

As root do:

```bash
# mysqladmin -u root -p create dbplayers
```

The password is empty

## Connect to MariaDB:

```bash
# mysql
```

## Show databases

```
MariaDB [(none)]> show databases;
```

## Use dbplayers database

```
MariaDB [(none)]> use dbplayers;
```

The following prompt should be showed after that:

```
MariaDB [dbplayers]>
```

## Create user for the dbplayer database:

```bash
$ mysql -u root -p 
```

Then do

```
MariaDB [(none)]> CREATE user 'dbplayers' IDENTIFIED BY 'db_password';
Query OK, 0 rows affected (0.595 sec)
```

db_password should be a secure password for the dbplayers user.

## Grant access to the dbplayers database

As root do:

```
myql
MariaDB [(none)]> GRANT ALL ON dbplayers.* TO 'dbplayers' IDENTIFIED BY 'db_password';
```

# Using the app

```bash
$ mvn spring-boot:run
```

## Create a player

```bash
curl -X POST --location "http://localhost:8080/api/v1/players" \
    -H "Content-Type: application/json" \
    -d "{
          \"name\": \"Leonel Messi\",
          \"age\": 35,
          \"nationality\": \"Argentina\"
        }"
```

## Get all players

```bash
curl -X GET --location "http://localhost:8080/api/v1/players"
```

## Get player by id

```bash
curl -X GET --location "http://localhost:8080/api/v1/players/1"
```

## Update player

```bash
curl -X PUT --location "http://localhost:8080/api/v1/players/1" \
    -H "Content-Type: application/json" \
    -d "{
          \"name\": \"Leo Messi\",
          \"age\": 35,
          \"nationality\": \"Argentina\"
        }"
```

## Delete a player

```bash
curl -X DELETE --location "http://localhost:8080/api/v1/players/1"
```


