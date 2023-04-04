package com.woniuxy.wuye.query.mapper;

import com.woniuxy.wuye.entity.House;
import com.woniuxy.wuye.query.HouseQO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HouseMapper {
    void add(House house);
    void update(House house);
    void del(int id);

    List<House>getAll();

    House getById(int id);

    List<House>getByCondition(House house);

    List<House>getPageByCondition(@Param("house") House house, @Param("start") int start, @Param("pageSize") int pageSize);

    List<House>getPageByCondition2(HouseQO houseQO);
    int getCountByCondition(House house);


}
