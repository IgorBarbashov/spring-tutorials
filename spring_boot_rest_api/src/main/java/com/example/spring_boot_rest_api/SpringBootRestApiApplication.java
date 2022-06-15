package com.example.spring_boot_rest_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootRestApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootRestApiApplication.class, args);
    }

}

//docker run -d --name mysql --user root -p 3306:3306 -e MYSQL_ROOT_PASSWORD=root -e MYSQL_USER=root -e MYSQL_DATABASE=students mysql
//docker run -d --name mysql --user root -p 3306:3306 -e MYSQL_ROOT_PASSWORD=root mysql

//CREATE TABLE students (
//    id long NOT NULL PRIMARY KEY,
//    name varchar(30),
//    date_of_birth varchar(10)
//);
