package com.brandom.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class BrandomProductSrvApplication {

    public static void main(String[] args) {
        SpringApplication.run(BrandomProductSrvApplication.class, args);
    }

}
