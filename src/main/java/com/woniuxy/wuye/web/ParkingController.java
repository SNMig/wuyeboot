package com.woniuxy.wuye.web;



import com.woniuxy.wuye.entity.Parking;
import com.woniuxy.wuye.service.ParkingService;
import com.woniuxy.wuye.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/parking")
public class ParkingController {



    @Autowired
    private ParkingService parkingService;

    @PostMapping("/add")
    public ResponseResult<Void> add(@RequestBody Parking parking) {
        parkingService.add(parking);
        return ResponseResult.ok();
    }

    @RequestMapping("/list")
    public ResponseResult<List<Parking>> list() {
        List<Parking> parkings = parkingService.getAll();
        return ResponseResult.ok(parkings);
    }

    @RequestMapping("/del")
    public ResponseResult<Void> del(@RequestBody Parking parking) {
        parkingService.del(parking.getId());
        return ResponseResult.ok();
    }
}
