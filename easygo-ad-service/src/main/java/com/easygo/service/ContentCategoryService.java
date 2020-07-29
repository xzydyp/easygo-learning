package com.easygo.service;

import com.easygo.pojo.ContentCategory;

import java.util.List;
import java.util.Map;

/**
 * @BelongsProject: easygo
 * @BelongsPackage: com.easygo.service
 * @Author: bruceliu
 * @QQ:1241488705
 * @CreateTime: 2020-03-30 10:23
 * @Description: TODO
 */
public interface ContentCategoryService {

     Integer getTotalCount(Map<String, Object> map);

     List<ContentCategory> getContentCategoryPages(Map<String, Object> map);

     int addContentCategory(ContentCategory category);

     int updateContentCategory(ContentCategory category);

     int deleteContentCategory(Integer id);

     int deleteSomeContentCategory(String ids);

     ContentCategory getById(Integer id);

}
