package com.huihuitf.facelogin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;
@SpringBootApplication
@MapperScan(basePackages="com.huihuitf.facelogin.dao")
public class FaceloginApplication {

    public static void main(String[] args) {
        SpringApplication.run(FaceloginApplication.class, args);
    }

}
