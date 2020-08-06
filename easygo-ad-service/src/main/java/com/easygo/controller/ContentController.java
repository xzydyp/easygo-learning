package com.easygo.controller;

import com.easygo.pojo.Content;
import com.easygo.service.ContentService;
import com.easygo.utils.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @BelongsProject: easygo
 * @BelongsPackage: com.easygo.controller
 * @Author: bruceliu
 * @QQ:1241488705
 * @CreateTime: 2020-03-30 14:58
 * @Description: TODO
 */
@RestController
@Scope("prototype")
public class ContentController {

    @Autowired
    ContentService contentService;

    /**
     * 查询指定广告
     * @param categoryId
     * @return
     */
    @RequestMapping("/content_getContentsByCategoryId")
    public List<Content> getContentsByCategoryId(@RequestParam Integer categoryId){
        return contentService.getContentsByCategoryId(categoryId);
    }

    @RequestMapping("/content_page")
    public PageUtils<Content> getContent_page(@RequestParam(defaultValue = "1",required = false) Integer pageIndex,
                                   @RequestParam(defaultValue = "5",required = false) Integer pageSize){
        Map<String,Object> map=new HashMap<>();
        map.put("pageStart",(pageIndex-1)*pageSize);
        map.put("pageSize",pageSize);
        Integer totalCount = contentService.getTotalCount();
        List<Content> contents = contentService.getContents(map);
        return new PageUtils<>(pageIndex,pageSize,totalCount,contents);
    }
}
