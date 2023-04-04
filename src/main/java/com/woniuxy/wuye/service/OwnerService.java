package com.woniuxy.wuye.service;

import com.woniuxy.wuye.entity.Owner;
import com.woniuxy.wuye.entity.User;

import java.util.List;

public interface OwnerService {
    void add(User user, Owner owner);
    List<Owner> getAll();
    Owner getById(Integer id);
}
