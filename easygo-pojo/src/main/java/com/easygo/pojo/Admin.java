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
 * @CreateTime: 2020-03-28 11:24
 * @Description: TODO
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Admin implements Serializable {

    private static final long serialVersionUID = -4661478899811906793L;

    private Integer id;
    private String username;
    private String password;
    private String status;
    private String photo;
    private Integer del;
}
