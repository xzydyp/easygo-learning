package com.easygo.service.impl;

import com.easygo.mapper.ContentMapper;
import com.easygo.pojo.Content;
import com.easygo.service.ContentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @BelongsProject: easygo
 * @BelongsPackage: com.easygo.service.impl
 * @Author: bruceliu
 * @QQ:1241488705
 * @CreateTime: 2020-03-30 14:57
 * @Description: TODO
 */
@Service
public class ContentServiceImpl implements ContentService {

    @Resource
    ContentMapper contentMapper;

    @Override
    public Integer getTotalCount() {
        return contentMapper.getTotalCount();
    }

    @Override
    public List<Content> getContents(Map<String, Object> map) {
        return contentMapper.getContents(map);
    }

    @Override
    public List<Content> getContentsByCategoryId(Integer categoryId) {
        return contentMapper.getContentsByCategoryId(categoryId);
    }
}
