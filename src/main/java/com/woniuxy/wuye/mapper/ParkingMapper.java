package com.woniuxy.wuye.mapper;


import com.woniuxy.wuye.entity.Parking;
import java.util.List;

public interface ParkingMapper {
    void add(Parking parking);
    void del(int id);
    List<Parking> getAll();
}
