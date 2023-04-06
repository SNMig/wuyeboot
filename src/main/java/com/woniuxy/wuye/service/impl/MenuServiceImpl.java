package com.woniuxy.wuye.service.impl;

import com.woniuxy.wuye.entity.Menu;
import com.woniuxy.wuye.mapper.MenuMapper;
import com.woniuxy.wuye.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class MenuServiceImpl implements MenuService {
    @Resource
    private MenuMapper menuMapper;
    @Override
    public List<Menu> getByUserId(int userId) {
        return menuMapper.getByUserId(userId);
    }

    @Override
    public List<Menu> getAll() {
        return menuMapper.getAll();
    }


}
