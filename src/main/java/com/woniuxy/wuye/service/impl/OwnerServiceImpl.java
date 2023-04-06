package com.woniuxy.wuye.service.impl;

import com.woniuxy.wuye.entity.Owner;
import com.woniuxy.wuye.entity.User;
import com.woniuxy.wuye.mapper.OwnerMapper;
import com.woniuxy.wuye.mapper.UserMapper;
import com.woniuxy.wuye.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OwnerServiceImpl implements OwnerService {

    @Resource
    OwnerMapper ownerMapper;

    @Resource
    UserMapper userMapper;
    @Override
    public void add(User user, Owner owner){


        userMapper.add(user);
        owner.setId(user.getId());
        ownerMapper.add(owner);

    }

    @Override
    public List<Owner> getAll() {
        return ownerMapper.getAll();
    }

    @Override
    public Owner getById(Integer id) {
        return ownerMapper.getById(id);
    }
}
