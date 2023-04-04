package com.woniuxy.wuye.service;

import com.woniuxy.wuye.entity.House;
import com.woniuxy.wuye.entity.PageBean;
import com.woniuxy.wuye.entity.Payment;
import com.woniuxy.wuye.query.HouseQO;
import com.woniuxy.wuye.query.PaymentQO;

import java.util.List;

public interface PaymentService {
    void add(Payment payment);
    List<Payment> getAll();
    PageBean<Payment> getByPage(PaymentQO paymentQO, Integer page);
}
