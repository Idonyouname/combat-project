package com.liugui.servicebase;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.liugui.servicebase.mapper")
public class ServiceBaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceBaseApplication.class, args);
        System.out.println("**********************************启动完成**********************************");
    }

}
