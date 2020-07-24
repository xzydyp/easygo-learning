package com.easygo.mapper;

import com.easygo.pojo.LoginLog;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @BelongsProject: easygo
 * @BelongsPackage: com.easygo.mapper
 * @Author: bruceliu
 * @QQ:1241488705
 * @CreateTime: 2020-03-28 15:28
 * @Description: 登录日志操作的接口方法
 */
@Mapper
public interface LoginLogMapper {

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
