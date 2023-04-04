package com.woniuxy.wuye.service;

import com.woniuxy.wuye.entity.House;
import com.woniuxy.wuye.entity.PageBean;
import com.woniuxy.wuye.query.HouseQO;

import java.util.List;

public interface HouseService {

    void add(House house);
    void update(House house);
    void del(int id);

    List<House>getAll();
    House getById(Integer id);

    PageBean<House>getByPage(House house, int page);

    PageBean<House>getByPage2(HouseQO houseQO, Integer page);
}
