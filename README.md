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

## Create tb_player table:

```
MariaDB [dbplayers]> CREATE TABLE tb_player(id INT AUTO_INCREMENT, name VARCHAR(255) NOT NULL, age INT NOT NULL, nationality VARCHAR(255) NOT NULL, PRIMARY KEY (id));
Query OK, 0 rows affected (0.024 sec)
```
