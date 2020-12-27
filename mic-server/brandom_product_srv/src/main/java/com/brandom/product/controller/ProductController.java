package com.brandom.product.controller;

import com.common.core.enities.CommonResult;
import com.common.core.enities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * 描述:
 *
 * @version 0.1
 * @Author liujian
 * @date 2020/12/26 16:42
 * @since JDK1.8
 */
@RestController
@Slf4j
public class ProductController {

    public static final String PAYMENT_URL = "http://MALL-SRV";

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("/comsumer/payment/create")
    public CommonResult<Payment> getPayment(@RequestBody Payment payment){
        return restTemplate.postForObject(PAYMENT_URL + "/payment/create",payment, CommonResult.class);
    }

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id){
        return restTemplate.getForObject(PAYMENT_URL+"/payment/get/"+id,CommonResult.class);
    }
}
