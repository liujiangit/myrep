package com.brandom.product;

import com.brandom.myrule.MyRule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@RibbonClient(name = "MALL-SRV",configuration = MyRule.class)
@EnableEurekaClient
@SpringBootApplication
public class BrandomProductSrvApplication {

    public static void main(String[] args) {
        SpringApplication.run(BrandomProductSrvApplication.class, args);
    }

}
