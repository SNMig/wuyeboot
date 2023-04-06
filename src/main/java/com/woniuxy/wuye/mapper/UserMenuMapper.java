package com.woniuxy.wuye.mapper;


import org.apache.ibatis.annotations.Param;

public interface UserMenuMapper {
    void add(@Param("userId") int userId,@Param("menuId") int menuId);
    void del(@Param("userId") int userId,@Param("menuId") int menuId);
}
