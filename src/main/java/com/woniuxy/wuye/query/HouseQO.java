package com.woniuxy.wuye.query;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
@Getter
@Setter
@ToString
public class HouseQO {
    private String no;
    private Integer buildingId;
    private BigDecimal minArea;
    private BigDecimal maxArea;
}
