package com.brandom.order.service;


import com.brandom.order.service.impl.PaymentFallbackService;

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
@FeignClient(value = "MALL-SRV",fallback = PaymentFallbackService.class)
public interface PaymentHystrixService {

    @GetMapping("/payment/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id") Integer id);

    @GetMapping("/payment/hystrix/timeout/{id}")
    public String paymentInfo_TimeOut(@PathVariable("id") Integer id);
}
