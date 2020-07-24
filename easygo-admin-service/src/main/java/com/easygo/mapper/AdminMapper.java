package com.easygo.mapper;

import com.easygo.pojo.Admin;
import org.apache.ibatis.annotations.Mapper;

/**
 * @BelongsProject: easygo
 * @BelongsPackage: com.easygo.mapper
 * @Author: bruceliu
 * @QQ:1241488705
 * @CreateTime: 2020-03-28 11:29
 * @Description: TODO
 */
@Mapper
public interface AdminMapper {

     Admin adminlogin(Admin admin);
}
