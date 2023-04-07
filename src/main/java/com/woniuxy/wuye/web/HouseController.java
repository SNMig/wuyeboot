package com.woniuxy.wuye.web;


import com.woniuxy.wuye.entity.Building;
import com.woniuxy.wuye.entity.House;
import com.woniuxy.wuye.entity.Owner;
import com.woniuxy.wuye.entity.PageBean;
import com.woniuxy.wuye.query.HouseQO;
import com.woniuxy.wuye.service.BuildingService;
import com.woniuxy.wuye.service.HouseService;
import com.woniuxy.wuye.service.OwnerService;
import com.woniuxy.wuye.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/house")
public class HouseController {
    @Value("${uploadpath}")
    private String uploadPath;


    @Autowired
    private OwnerService ownerService;

    @Autowired
    private HouseService houseService;

    @PostMapping("/upload")
    public ResponseResult<String> upload(MultipartFile file) {

        String newFileName = UUID.randomUUID().toString().replaceAll("-", "");
        String originalFilename = file.getOriginalFilename();
        String suffix = originalFilename.substring(originalFilename.lastIndexOf("."));

        File dest = new File(uploadPath, newFileName + suffix);

        try {
            file.transferTo(dest);
            return ResponseResult.ok(newFileName + suffix);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @GetMapping("/listOwners")
    public ResponseResult<List<Owner>> listOwners() {
        return ResponseResult.ok(ownerService.getAll());
    }

    @PostMapping("/add")
    public ResponseResult<Void> add(@RequestBody House house) {
        houseService.add(house);
        return ResponseResult.ok();
    }

    @GetMapping({"/list", "/list{page}"})
    public ResponseResult<PageBean<House>> list(HouseQO houseQO, @PathVariable(required = false) Integer page) {
        if (page == null) {
            page = 1;
        }
        PageBean<House> pageBean = houseService.getByPage2(houseQO, page);

        return ResponseResult.ok(pageBean);
    }

    @PostMapping("/update")
    public ResponseResult<Void> update(@RequestBody House house) {

        houseService.update(house);

        return ResponseResult.ok();
    }
}
