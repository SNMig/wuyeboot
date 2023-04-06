package com.woniuxy.wuye.service;

import com.woniuxy.wuye.entity.Menu;

import java.util.List;

public interface MenuService {
    List<Menu> getByUserId(int userId);

    List<Menu>getAll();
}
