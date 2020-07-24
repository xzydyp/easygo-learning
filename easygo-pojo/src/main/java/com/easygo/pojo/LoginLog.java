package com.easygo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @BelongsProject: easygo
 * @BelongsPackage: com.easygo.pojo
 * @Author: bruceliu
 * @QQ:1241488705
 * @CreateTime: 2020-03-28 15:26
 * @Description: TODO
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginLog implements Serializable {

    private static final long serialVersionUID = 7532396427016551234L;

    private Integer id;
    private String ip;
    private String no;//登录账号
    private String createtime;
    private String location;

    public LoginLog(String ip, String no, String location) {
        this.ip = ip;
        this.no = no;
        this.location = location;
    }
}
