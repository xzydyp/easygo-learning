package com.easygo.mapper;

import com.easygo.pojo.Content;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @BelongsProject: easygo
 * @BelongsPackage: com.easygo.mapper
 * @Author: bruceliu
 * @QQ:1241488705
 * @CreateTime: 2020-03-30 14:48
 * @Description: TODO
 */
@Mapper
public interface ContentMapper {

     Integer getTotalCount();

     List<Content> getContents(Map<String, Object> map);

    //查询指定类目下的所有有效广告
     List<Content> getContentsByCategoryId(Integer categoryId);
}
