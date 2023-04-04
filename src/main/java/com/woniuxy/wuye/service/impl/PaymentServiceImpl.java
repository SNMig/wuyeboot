package com.woniuxy.wuye.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.woniuxy.wuye.entity.House;
import com.woniuxy.wuye.entity.PageBean;
import com.woniuxy.wuye.entity.Payment;
import com.woniuxy.wuye.mapper.PaymentMapper;
import com.woniuxy.wuye.query.PaymentQO;
import com.woniuxy.wuye.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentMapper paymentMapper;
    @Override
    public void add(Payment payment) {
        payment.setTransferTime(LocalDateTime.now());
        paymentMapper.add(payment);
    }

    @Override
    public List<Payment> getAll() {
        return paymentMapper.getAll();
    }

    @Override
    public PageBean<Payment> getByPage(PaymentQO paymentQO, Integer page) {
        int pageSize=5;
        PageBean<Payment> pageBean=new PageBean<>();
        PageHelper.startPage(page,pageSize);
        Page<Payment> p=(Page<Payment>) paymentMapper.getPageByCondition(paymentQO);
        pageBean.setData(p.getResult());
        pageBean.setCurrPage(page);
        pageBean.setPageSize(pageSize);
        pageBean.setActualNum(pageBean.getData().size());
        int totalNums=(int)p.getTotal();
        pageBean.setTotalNums(totalNums);
        int totalPage=p.getPages();
        pageBean.setTotalPage(totalPage);
        return pageBean;
    }
}
