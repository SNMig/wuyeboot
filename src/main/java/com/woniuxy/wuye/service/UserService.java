package com.woniuxy.wuye.service;

import com.woniuxy.wuye.entity.User;

import java.util.List;

public interface UserService {
    User login(String account,String password);
    boolean isExist(String account);

    List<User> getAll();

    void addUserMenu(User user,int[] ids);

}
