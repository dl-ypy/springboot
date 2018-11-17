package com.ypy.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan(basePackages = "com.ypy")
@MapperScan("com.ypy.springboot.mapper")    //扫描mapper文件
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
