package com.brandom.order.service.impl;

import com.brandom.order.service.PaymentHystrixService;

import org.springframework.stereotype.Component;

/**
 * 描述:
 *
 * @version 0.1
 * @Author liujian
 * @date 2021/01/04 13:42
 * @since JDK1.8
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_OK , (┬＿┬)";

    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_TimeOut , (┬＿┬)";

    }
}
