package com.brandom.mall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@MapperScan("com.brandom.mall.dao")
@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker
public class BrandomMallSrvApplication {

    public static void main(String[] args) {
        SpringApplication.run(BrandomMallSrvApplication.class, args);
    }

}
