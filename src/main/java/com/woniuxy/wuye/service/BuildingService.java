package com.woniuxy.wuye.service;

import com.woniuxy.wuye.entity.Building;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BuildingService {
    void add(Building building);
    void update(Building building);
    void del(int id);
    List<Building> getAll();
    Building getById(int id);
    void updateStatus(@Param("ids") int[] ids);
}
