package com.woniuxy.wuye.exception;

public class AccountExistException extends RuntimeException{
    public AccountExistException(){

    }
    public AccountExistException(String msg){
        super(msg);
    }
    public AccountExistException(Throwable code){
        super(code);
    }
    public AccountExistException(String msg,Throwable code){
        super(msg,code);
    }
}
