package com.woniuxy.wuye.query.mapper;

import com.woniuxy.wuye.entity.Payment;
import com.woniuxy.wuye.query.PaymentQO;

import java.util.List;

public interface PaymentMapper {
    void add(Payment payment);
    List<Payment> getAll();
    List<Payment>getPageByCondition(PaymentQO paymentQO);
}
