package com.brandom.mall.service;

import com.common.core.entities.Payment;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PathVariable;

public interface PaymentService {

    public String paymentCircuitBreaker(@PathVariable("id") Integer id);

    public int create(Payment payment); //写

    public Payment getPaymentById(@Param("id") Long id);  //读取

    public String paymentInfo_OK(Integer id);

    public String paymentInfo_TimeOut(Integer id);
}
