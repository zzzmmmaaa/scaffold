package com.sleepy.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;


@SpringBootApplication
@ComponentScan(basePackages = {"com.sleepy"})
@EnableR2dbcRepositories(basePackages = {"com.sleepy"})
public class ScaffoldApplication {

    public static void main(String[] args)  {
        SpringApplication.run(ScaffoldApplication.class, args);
    }

}
