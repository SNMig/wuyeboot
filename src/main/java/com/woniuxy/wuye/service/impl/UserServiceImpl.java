package com.woniuxy.wuye.service.impl;

import com.woniuxy.wuye.entity.User;
import com.woniuxy.wuye.exception.AccountExistException;
import com.woniuxy.wuye.mapper.MenuMapper;
import com.woniuxy.wuye.mapper.UserMapper;
import com.woniuxy.wuye.mapper.UserMenuMapper;
import com.woniuxy.wuye.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Resource
    private UserMenuMapper userMenuMapper;
    @Override
    public User login(String account,String password) {
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

    @Override
    public void addUserMenu(User user, int[] ids) {

        user.setStatus("y");
        userMapper.add(user);
        for (int id : ids) {
            userMenuMapper.add(user.getId(), id);
        }
    }


}
