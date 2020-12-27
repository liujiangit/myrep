package com.brandom.mall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.brandom.mall.dao")
@SpringBootApplication
public class BrandomMallSrvApplication {

    public static void main(String[] args) {
        SpringApplication.run(BrandomMallSrvApplication.class, args);
    }

}
