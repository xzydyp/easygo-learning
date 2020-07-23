package com.easygo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author:熊志阳
 * @date:2020/7/22
 * @description
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApp {
    public static void main(String[] args) {
        System.out.println("*******eureka启动:9001*******");
        SpringApplication.run(EurekaApp.class,args);
    }
}
