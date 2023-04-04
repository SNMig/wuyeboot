package com.woniuxy.wuye.query.mapper;

import com.woniuxy.wuye.entity.Menu;

import java.util.List;

public interface MenuMapper {
    List<Menu> getAll();
    Menu getById(int id);
    List<Menu> getByUserId(int userId);
}
