package com.easygo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @BelongsProject: easygo
 * @BelongsPackage: com.easygo
 * @Author: bruceliu
 * @QQ:1241488705
 * @CreateTime: 2020-03-30 09:57
 * @Description: TODO
 */
@SpringBootApplication
@EnableEurekaClient
public class AdServiceApp {

    public static void main(String[] args) {
        System.out.println("广告服务9004.......");
        SpringApplication.run(AdServiceApp.class,args);
    }
}
