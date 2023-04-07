package com.woniuxy.wuye.entity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@ToString
public class Building {
    private Integer id;
    @NotNull
    private String name;
    @NotNull
    @Size(min = 3,max = 4)
    private String units;
    private String status;
}
