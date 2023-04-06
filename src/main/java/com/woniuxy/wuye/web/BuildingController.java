package com.woniuxy.wuye.web;

import com.woniuxy.wuye.entity.Building;
import com.woniuxy.wuye.service.BuildingService;
import com.woniuxy.wuye.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
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
    public ResponseResult<Void> add(@RequestBody Building building){
        ResponseResult<Void> responseResult=new ResponseResult<Void>();

        try {
            buildingService.add(building);
            responseResult.setCode(200);
            responseResult.setMsg("ok");
            return responseResult;
        }catch (Exception e){
            responseResult.setCode(-1);
            responseResult.setMsg("系统错误");
            return responseResult;
        }
    }

    @RequestMapping("list")
    public ResponseResult<List<Building>>list(){
        ResponseResult<List<Building>> responseResult=new ResponseResult<>();
        List<Building>buildings=buildingService.getAll();
        responseResult.setCode(200);
        responseResult.setData(buildings);
        return responseResult;
    }
}
