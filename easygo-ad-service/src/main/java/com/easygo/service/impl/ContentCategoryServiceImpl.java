package com.easygo.service.impl;

import com.easygo.mapper.ContentCategoryMapper;
import com.easygo.pojo.ContentCategory;
import com.easygo.service.ContentCategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @BelongsProject: easygo
 * @BelongsPackage: com.easygo.service.impl
 * @Author: bruceliu
 * @QQ:1241488705
 * @CreateTime: 2020-03-30 10:23
 * @Description: TODO
 */
@Service
public class ContentCategoryServiceImpl implements ContentCategoryService {

    @Resource
    ContentCategoryMapper contentCategoryMapper;

    @Override
    public Integer getTotalCount(Map<String, Object> map) {
        return contentCategoryMapper.getTotalCount(map);
    }

    @Override
    public List<ContentCategory> getContentCategoryPages(Map<String, Object> map) {
        return contentCategoryMapper.getContentCategoryPages(map);
    }

    @Override
    public int addContentCategory(ContentCategory category) {
        return contentCategoryMapper.addContentCategory(category);
    }

    @Override
    public int updateContentCategory(ContentCategory category) {
        return contentCategoryMapper.updateContentCategory(category);
    }

    @Override
    public int deleteContentCategory(Integer id) {
        return contentCategoryMapper.deleteContentCategory(id);
    }

    @Override
    public int deleteSomeContentCategory(String ids) {
        return contentCategoryMapper.deleteSomeContentCategory(ids);
    }

    @Override
    public ContentCategory getById(Integer id) {
        return contentCategoryMapper.getById(id);
    }
}
