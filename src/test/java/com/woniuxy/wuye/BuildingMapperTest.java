package com.woniuxy.wuye;

import com.woniuxy.wuye.mapper.BuildingMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class BuildingMapperTest {

    @Resource
    private BuildingMapper buildingMapper;
    @Test
    public void testGetAll(){
        buildingMapper.getAll().forEach(System.out::println);
    }
}
