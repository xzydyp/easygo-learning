package com.easygo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @BelongsProject: easygo
 * @BelongsPackage: com.easygo
 * @Author: bruceliu
 * @QQ:1241488705
 * @CreateTime: 2020-03-27 11:21
 * @Description: TODO
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class AdminWebApp {

    public static void main(String[] args) {
        System.out.println("运营商管理WEB,9002......");
        SpringApplication.run(AdminWebApp.class,args);
    }
}
