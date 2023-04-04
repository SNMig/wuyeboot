package com.woniuxy.wuye.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.LocalDate;
@Getter
@Setter
@ToString
public class House {
    private Integer id;
    private String no;
    private Integer buildingId;
    private BigDecimal area;
    private String remark;
    private Integer ownerId;
    private LocalDate deliveryDay;
    private String image;

    private Building building;
    private Owner owner;
}
