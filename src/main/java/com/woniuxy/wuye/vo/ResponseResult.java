package com.woniuxy.wuye.vo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ResponseResult<T> {
    private int code;
    private String msg;
    private T data;
    public static ResponseResult<Void>ok(){
        return ResponseResult.<Void>builder().code(200).msg("ok").build();
    }

    public static<T> ResponseResult<T>ok(T data){
        return ResponseResult.<T>builder().code(200).msg("ok").data(data).build();
    }



    public static ResponseResult<Void>fail(){
        return ResponseResult.<Void>builder().code(500).msg("fail").build();
    }
}
