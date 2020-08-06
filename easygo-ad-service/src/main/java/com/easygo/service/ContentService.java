package com.easygo.service;

import com.easygo.pojo.Content;

import java.util.List;
import java.util.Map;

/**
 * @BelongsProject: easygo
 * @BelongsPackage: com.easygo.service
 * @Author: bruceliu
 * @QQ:1241488705
 * @CreateTime: 2020-03-30 14:57
 * @Description: TODO
 */
public interface ContentService {

     Integer getTotalCount();

     List<Content> getContents(Map<String, Object> map);

    //查询指定类目下的所有有效广告
     List<Content> getContentsByCategoryId(Integer categoryId);
}
