package com.easygo.service;

import com.easygo.pojo.LoginLog;

import java.util.List;

/**
 * @BelongsProject: easygo
 * @BelongsPackage: com.easygo.service
 * @Author: bruceliu
 * @QQ:1241488705
 * @CreateTime: 2020-03-28 15:56
 * @Description: TODO
 */
public interface LoginLogService {
    /**
     * 新增登录日志
     * @param log
     * @return
     */
    public int addLoginLog(LoginLog log);

    /*
     * 获取登录人的日志  获取最近10次登录日志
     */
    public List<LoginLog> getMyLoginLogs(String username);

}
