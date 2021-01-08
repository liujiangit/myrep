package com.brandom.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
@EnableHystrix
public class BrandomOrderSrvApplication {

    public static void main(String[] args) {
        SpringApplication.run(BrandomOrderSrvApplication.class, args);
    }

}
