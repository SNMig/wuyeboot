package com.woniuxy.wuye.vo;

import lombok.Builder;
import lombok.Data;

@Data

public class ResponseResult<T> {
    private int code;
    private String msg;
    private T data;
//    public static ResponseResult<Void>ok(){
//        return ResponseResult.<Void>builder().code(200).msg("ok").build();
//    }
}
