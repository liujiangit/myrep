package com.brandom.order.service;

import com.common.core.entities.CommonResult;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 描述: feign接口
 *
 * @version 0.1
 * @Author liujian
 * @date 2020/12/29 16:23
 * @since JDK1.8
 */
@Component
@FeignClient(value = "MALL-SRV1")
public interface MallFeignService {

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id);

    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeout();
}
