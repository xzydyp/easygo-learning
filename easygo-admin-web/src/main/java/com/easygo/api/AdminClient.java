package com.easygo.api;

import com.easygo.pojo.Admin;
import com.easygo.pojo.LoginLog;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @BelongsProject: easygo
 * @BelongsPackage: com.easygo.api
 * @Author: bruceliu
 * @QQ:1241488705
 * @CreateTime: 2020-03-28 11:39
 * @Description: TODO
 */
@FeignClient(value = "easygo-admin-service")
public interface AdminClient {

    @RequestMapping("/admin_login")
     Admin adminLogin(@RequestBody Admin admin);



}
