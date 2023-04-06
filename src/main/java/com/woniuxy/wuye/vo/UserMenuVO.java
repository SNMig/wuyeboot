package com.woniuxy.wuye.vo;

import com.woniuxy.wuye.entity.User;
import lombok.Data;

@Data
public class UserMenuVO {
    private User user;
    private int[] menuIds;
}
