package com.woniuxy.wuye.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.LocalDateTime;
@Getter
@Setter
@ToString
public class Payment {
    private Integer id;
    private Integer payowner;
    private String month;
    private BigDecimal money;
    private LocalDateTime transferTime;
    private Integer midpeople;

    private Owner payownerId;
    private User userId;
}
