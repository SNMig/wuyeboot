package com.woniuxy.wuye.entity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Parking {
    private Integer id;
    private Integer no;
    private Integer owner;
    private Integer total;
    private Integer remaining=1000;
    private String status;
}
