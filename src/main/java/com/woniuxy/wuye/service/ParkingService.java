package com.woniuxy.wuye.service;


import com.woniuxy.wuye.entity.Parking;

import java.util.List;

public interface ParkingService {
    void add(Parking parking);

    void del(int id);
    List<Parking> getAll();

}
