package com.easygo.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @BelongsProject: easygo
 * @BelongsPackage: com.easygo.controller
 * @Author: bruceliu
 * @QQ:1241488705
 * @CreateTime: 2020-03-28 11:43
 * @Description: TODO
 */
@Controller
@Scope("prototype")
public class CommonController {

    /**
     * 跳转登录页面
     * @return
     */
    @RequestMapping({"/","/admin"})
    public String toLogin(){
        return "login";
    }

    /**
     * 通用的页面跳转
     * @param page
     * @return
     */
    @RequestMapping("/page_{page}")
    public String page(@PathVariable("page") String page){
        return  page;
    }
}
