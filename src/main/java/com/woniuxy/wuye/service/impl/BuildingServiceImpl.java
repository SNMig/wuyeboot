package com.woniuxy.wuye.service.impl;

import com.woniuxy.wuye.entity.Building;
import com.woniuxy.wuye.mapper.BuildingMapper;
import com.woniuxy.wuye.service.BuildingService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuildingServiceImpl implements BuildingService {
    @Autowired
    BuildingMapper buildingMapper;
    @Override
    public void add(Building building) {
        building.setStatus("y");
        buildingMapper.add(building);
    }

    @Override
    public void update(Building building) {
        buildingMapper.update(building);
    }

    @Override
    public void del(int id) {
        buildingMapper.del(id);
    }

    @Override
    public List<Building> getAll() {
        List<Building> list=buildingMapper.getAll();
        return list;

    }

    @Override
    public Building getById(int id) {
        return buildingMapper.getById(id);
    }

    @Override
    public void updateStatus(@Param("ids") int[] ids) {
        buildingMapper.updateStatus(ids);
    }
}
