package com.woniuxy.wuye.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.woniuxy.wuye.entity.House;
import com.woniuxy.wuye.entity.PageBean;
import com.woniuxy.wuye.mapper.HouseMapper;
import com.woniuxy.wuye.query.HouseQO;
import com.woniuxy.wuye.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HouseServiceImpl implements HouseService {
    @Autowired
    private HouseMapper houseMapper;


    @Override
    public void add(House house) {
        houseMapper.add(house);
    }

    @Override
    public void update(House house) {
        houseMapper.update(house);
    }

    @Override
    public void del(int id) {

    }

    @Override
    public List<House> getAll() {
        return houseMapper.getAll();
    }

    @Override
    public House getById(Integer id) {
        return houseMapper.getById(id);
    }

    public PageBean<House> getByPage(House house, int page){
        int pageSize=2;
        PageBean<House> pageBean=new PageBean<>();
        List<House> data=houseMapper.getPageByCondition(house,(page-1)*pageSize,pageSize);
        pageBean.setData(data);
        pageBean.setCurrPage(page);
        pageBean.setPageSize(pageSize);
        pageBean.setActualNum(data.size());
        int totalNums=houseMapper.getCountByCondition(house);
        pageBean.setTotalNums(totalNums);
        int totalPage=totalNums%pageSize==0?totalNums/pageSize:totalNums/pageSize+1;
        pageBean.setTotalPage(totalPage);
        return pageBean;
    }

    public PageBean<House>getByPage2(HouseQO houseQO, Integer page){
        int pageSize=5;
        PageBean<House> pageBean=new PageBean<>();
        PageHelper.startPage(page,pageSize);
        Page<House> p=(Page<House>) houseMapper.getPageByCondition2(houseQO);
        pageBean.setData(p.getResult());
        pageBean.setCurrPage(page);
        pageBean.setPageSize(pageSize);
        pageBean.setActualNum(pageBean.getData().size());
        int totalNums=(int)p.getTotal();
        pageBean.setTotalNums(totalNums);
        int totalPage=p.getPages();
        pageBean.setTotalPage(totalPage);
        return pageBean;
    }


    public HouseMapper getHouseMapper() {
        return houseMapper;
    }


    public void setHouseMapper(HouseMapper houseMapper) {
        this.houseMapper = houseMapper;
    }
}
