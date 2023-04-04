package com.woniuxy.wuye.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class User {
    private Integer id;
    private String account;
    private String password;
    private String role;
    private String status;

    private List<Menu> menus;
}
