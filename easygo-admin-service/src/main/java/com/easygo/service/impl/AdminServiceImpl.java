package com.easygo.service.impl;

import com.easygo.mapper.AdminMapper;
import com.easygo.pojo.Admin;
import com.easygo.service.AdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @BelongsProject: easygo
 * @BelongsPackage: com.easygo.service
 * @Author: bruceliu
 * @QQ:1241488705
 * @CreateTime: 2020-03-28 11:32
 * @Description: TODO
 */
@Service
public class AdminServiceImpl implements AdminService {

    @Resource
    AdminMapper adminMapper;

    @Override
    public Admin adminlogin(Admin admin) {
        return adminMapper.adminlogin(admin);
    }
}
