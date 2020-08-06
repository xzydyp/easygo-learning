package com.easygo.controller;

import com.easygo.api.ContentClient;
import com.easygo.pojo.Content;
import com.easygo.utils.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @BelongsProject: easygo
 * @BelongsPackage: com.easygo.controller
 * @Author: bruceliu
 * @QQ:1241488705
 * @CreateTime: 2020-03-30 15:03
 * @Description: TODO
 */
@Controller
@Scope("prototype")
public class ContentController {

    @Autowired
    ContentClient contentClient;

    /**
     * 广告分页
     * @param pageIndex
     * @param pageSize
     * @param model
     * @return
     */
    @RequestMapping("/content_page")
    public String getContent_page(@RequestParam(defaultValue = "1", required = false) Integer pageIndex,
                                  @RequestParam(defaultValue = "5", required = false) Integer pageSize, Model model) {
        System.out.println("我进来咯");
        PageUtils<Content> pageUtils = contentClient.getContent_page(pageIndex, pageSize);
        model.addAttribute("pageUtils",pageUtils);
        return "content";
    }

}
