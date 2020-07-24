package com.easygo.service.impl;

import com.easygo.mapper.LoginLogMapper;
import com.easygo.pojo.LoginLog;
import com.easygo.service.LoginLogService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @BelongsProject: easygo
 * @BelongsPackage: com.easygo.service.impl
 * @Author: bruceliu
 * @QQ:1241488705
 * @CreateTime: 2020-03-28 15:56
 * @Description: TODO
 */
@Service
public class LoginLogServiceImpl implements LoginLogService {

    @Resource
    LoginLogMapper loginLogMapper;

    @Override
    public int addLoginLog(LoginLog log) {
        return loginLogMapper.addLoginLog(log);
    }

    @Override
    public List<LoginLog> getMyLoginLogs(String username) {
        return loginLogMapper.getMyLoginLogs(username);
    }
}
