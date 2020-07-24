package com.easygo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @BelongsProject: easygo
 * @BelongsPackage: com.easygo
 * @Author: bruceliu
 * @QQ:1241488705
 * @CreateTime: 2020-03-28 11:27
 * @Description: TODO
 */
@SpringBootApplication
@EnableEurekaClient
public class AdminServiceApp {

    public static void main(String[] args) {
        System.out.println("管理员服务9003.......");
        SpringApplication.run(AdminServiceApp.class,args);
    }
}
