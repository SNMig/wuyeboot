package com.woniuxy.wuye.service;

import com.woniuxy.wuye.entity.User;

import java.util.List;

public interface UserService {
    User getAccountAndPwd(String account,String password);
    boolean isExist(String account);

    List<User> getAll();
}
