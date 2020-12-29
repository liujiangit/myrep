package com.brandom.order.controller;

import com.brandom.order.service.MallFeignService;
import com.common.core.entities.CommonResult;
import com.common.core.entities.Payment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述: feign调用接口
 *
 * @version 0.1
 * @Author liujian
 * @date 2020/12/29 16:25
 * @since JDK1.8
 */
@RestController
public class OpenFeignController {

    @Autowired
    private MallFeignService mallFeignService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        return mallFeignService.getPaymentById(id);
    }

    @GetMapping(value = "/consumer/payment/feign/timeout")
    public String paymentFeignTimeout(){
        return mallFeignService.paymentFeignTimeout();
    }
}
