package com.woniuxy.wuye.entity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
public class Menu {
    private Integer id;
    private String name;
    private String link;
    private Integer pid;
    private List<Menu> subMenus=new ArrayList<>();
}
