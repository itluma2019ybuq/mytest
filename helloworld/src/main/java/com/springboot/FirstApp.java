package com.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 飞鸟
 * @create 2020-01-09 9:52
 */
@SpringBootApplication
@MapperScan(basePackages = "com.springboot.mapper")
public class FirstApp {
    public static void main(String[] args) {
        SpringApplication.run(FirstApp.class, args);
    }
}
