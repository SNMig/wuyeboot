package com.woniuxy.wuye.service.impl;

import com.woniuxy.wuye.entity.User;
import com.woniuxy.wuye.mapper.UserMapper;
import com.woniuxy.wuye.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User getAccountAndPwd(String account,String password) {
        return userMapper.getAccountAndPwd(account,password);
    }

    @Override
    public boolean isExist(String account) {
        return userMapper.getAccountCount(account)>0;
    }

    @Override
    public List<User> getAll() {
        return userMapper.getAll();
    }


}
