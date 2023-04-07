package com.woniuxy.wuye.web;

import com.woniuxy.wuye.entity.Building;
import com.woniuxy.wuye.service.BuildingService;
import com.woniuxy.wuye.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/building")
public class BuildingController {

    @Resource
    private BuildingService buildingService;

    @RequestMapping("/add")
    public ResponseResult<Void> add(@Validated @RequestBody Building building) {
        buildingService.add(building);
        return ResponseResult.ok();
    }

    @RequestMapping("list")
    public ResponseResult<List<Building>> list() {
        List<Building> buildings = buildingService.getAll();
        return ResponseResult.ok(buildings);
    }
}
