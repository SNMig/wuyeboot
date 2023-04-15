package com.woniuxy.wuye.service.impl;



import com.woniuxy.wuye.entity.Parking;
import com.woniuxy.wuye.mapper.ParkingMapper;
import com.woniuxy.wuye.service.ParkingService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ParkingServiceImpl implements ParkingService {
    @Resource
    ParkingMapper parkingMapper;
    @Override
    public void add(Parking parking) {
        parking.setStatus("y");
        parking.setTotal(1000);
        parking.setRemaining(parking.getRemaining()-1);
        parkingMapper.add(parking);
    }



    @Override
    public void del(int id) {
        parkingMapper.del(id);
    }

    @Override
    public List<Parking> getAll() {
        List<Parking> list=parkingMapper.getAll();
        return list;

    }

}
