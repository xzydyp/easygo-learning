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
 * @CreateTime: 2020-03-30 09:53
 * @Description: TODO
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContentCategory implements Serializable {

    private static final long serialVersionUID = 5266300161133421639L;

    private Integer id;
    private String name;
    private Integer del;
}
