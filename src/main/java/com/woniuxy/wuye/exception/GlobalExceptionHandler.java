package com.woniuxy.wuye.exception;

import com.woniuxy.wuye.vo.ResponseResult;
import org.springframework.dao.DataAccessException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestControllerAdvice(basePackages = "com.woniuxy.wuye.web")
public class GlobalExceptionHandler {
    @ExceptionHandler
    public ResponseResult<?> handleException(Exception e){
        if (e instanceof MethodArgumentNotValidException){
            Map<String,String> errorMap=new HashMap<>();
            List<FieldError> errors=((MethodArgumentNotValidException) e).getFieldErrors();
            for (FieldError error : errors) {
                String field=error.getField();
                String message=error.getDefaultMessage();
                errorMap.put(field,message);
            }
            return ResponseResult.<Map<String,String>>builder().code(405).msg("参数错误").data(errorMap).build();
        }else if (e instanceof DataAccessException){

        }
        return ResponseResult.fail();
    }
}
