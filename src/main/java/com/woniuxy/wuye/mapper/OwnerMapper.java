package com.woniuxy.wuye.mapper;

import com.woniuxy.wuye.entity.Owner;

import java.util.List;

public interface OwnerMapper {
    void add(Owner owner);
    void update(Owner owner);
    void del(Integer id);
    List<Owner> getAll();
    Owner getById(Integer id);
}
