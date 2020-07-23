package com.easygo.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @BelongsProject: easygo
 * @BelongsPackage: com.easygo.utils
 * @Author: bruceliu
 * @QQ:1241488705
 * @CreateTime: 2020-03-27 14:49
 * @Description: TODO
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MessageResults {

    private Integer code;
    private String message;
}
