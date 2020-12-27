package com.brandom.mall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.brandom.mall.dao")
@SpringBootApplication
public class BrandomMall02SrvApplication {

    public static void main(String[] args) {
        SpringApplication.run(BrandomMall02SrvApplication.class, args);
    }

}
