package com.woniuxy.wuye.query.mapper;

import com.woniuxy.wuye.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    void add(User user);
    void update(User user);
    void del(int id);
    List<User> getAll();
    User getById(int id);
    User getById2(int id);
    User getAccountAndPwd(@Param("account") String account,@Param("password") String password);
    int getAccountCount(String account);
}
