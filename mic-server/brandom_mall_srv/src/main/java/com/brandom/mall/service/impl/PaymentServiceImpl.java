package com.brandom.mall.service.impl;

import com.brandom.mall.dao.PaymentDao;
import com.brandom.mall.service.PaymentService;
import com.common.core.enities.Payment;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment){
        return paymentDao.insert(payment);
    }

    public Payment getPaymentById( Long id){

        return paymentDao.selectByPrimaryKey(id);

    }
}
