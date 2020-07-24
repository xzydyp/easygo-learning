package com.easygo.api;

import com.easygo.pojo.LoginLog;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @BelongsProject: easygo
 * @BelongsPackage: com.easygo.api
 * @Author: bruceliu
 * @QQ:1241488705
 * @CreateTime: 2020-03-28 16:06
 * @Description: TODO
 */
@FeignClient(value = "easygo-admin-service")
public interface LoginLogClient {

    /**
     * 新增日志
     * @param log
     * @return
     */
    @RequestMapping("/loginLog_add")
     int addLoginLog(@RequestBody LoginLog log);

    /**
     * 查询我的登录日志
     * @param username
     * @return
     */
    @RequestMapping("/loginLog_logs")
     List<LoginLog> getMyLoginLogs(@RequestParam(value = "username") String username);


}
