package com.woniuxy.wuye.query;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class PaymentQO {

    private Integer payowner;
    private Integer month;
    private LocalDateTime minTime;
    private LocalDateTime maxTime;
}
