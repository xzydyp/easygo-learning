package com.easygo.mapper;

import com.easygo.pojo.ContentCategory;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @BelongsProject: easygo
 * @BelongsPackage: com.easygo.mapper
 * @Author: bruceliu
 * @QQ:1241488705
 * @CreateTime: 2020-03-30 09:59
 * @Description: TODO
 */
@Mapper
public interface ContentCategoryMapper {

     Integer getTotalCount(Map<String, Object> map);

     List<ContentCategory> getContentCategoryPages(Map<String, Object> map);

     int addContentCategory(ContentCategory category);

     int updateContentCategory(ContentCategory category);

     int deleteContentCategory(Integer id);

     int deleteSomeContentCategory(String ids);

     ContentCategory getById(Integer id);

}
