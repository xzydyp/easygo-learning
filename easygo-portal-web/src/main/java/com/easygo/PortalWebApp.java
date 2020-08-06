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
 * @CreateTime: 2020-03-30 15:54
 * @Description: TODO
 */
@SpringBootApplication
@EnableEurekaClient //表示这个是一个Eureka客户端
@EnableFeignClients //开启Feign客户端
public class PortalWebApp {

    public static void main(String[] args) {
        System.out.println("首页门户9005.....");
        SpringApplication.run(PortalWebApp.class,args);
    }
}
