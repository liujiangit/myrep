package com.brandom.eureka02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class BrandomEureka02SrvApplication {

    public static void main(String[] args) {
        SpringApplication.run(BrandomEureka02SrvApplication.class, args);
    }

}
