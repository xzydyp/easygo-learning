package com.easygo.controller;

import com.easygo.pojo.Admin;
import com.easygo.pojo.LoginLog;
import com.easygo.service.AdminService;
import com.easygo.service.LoginLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @BelongsProject: easygo
 * @BelongsPackage: com.easygo.controller
 * @Author: bruceliu
 * @QQ:1241488705
 * @CreateTime: 2020-03-28 11:33
 * @Description: TODO
 */
@RestController
@Scope("prototype")
public class AdminController {

    @Autowired
    AdminService adminService;

    @Autowired
    LoginLogService loginLogService;

    /**
     * 新增日志
     * @param log
     * @return
     */
    @RequestMapping("/loginLog_add")
    public int addLoginLog(@RequestBody LoginLog log){
        System.out.println("新增的日志对象:"+log);
        return loginLogService.addLoginLog(log);
    }

    /**
     * 查询我的登录日志
     * @param username
     * @return
     */
    @RequestMapping("/loginLog_logs")
    public List<LoginLog> getMyLoginLogs(@RequestParam String username){
        return loginLogService.getMyLoginLogs(username);
    }

    @RequestMapping("/admin_login")
    public Admin adminLogin(@RequestBody Admin admin){
        return adminService.adminlogin(admin);
    }

}
