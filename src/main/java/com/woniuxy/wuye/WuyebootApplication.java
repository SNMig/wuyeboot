package com.woniuxy.wuye;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.woniuxy.wuye.mapper")
@SpringBootApplication
public class WuyebootApplication {

    public static void main(String[] args) {
        SpringApplication.run(WuyebootApplication.class, args);
    }

}
