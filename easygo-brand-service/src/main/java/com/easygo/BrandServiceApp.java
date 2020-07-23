package com.easygo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author:熊志阳
 * @date:2020/7/21
 * @description
 */
@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.easygo.mapper")
public class BrandServiceApp {
    public static void main(String[] args) {
        System.out.println("***************品牌服务启动***********");
        SpringApplication.run(BrandServiceApp.class);
    }
}
