package com.easygo.controller;

import com.easygo.api.ContentClient;
import com.easygo.pojo.Content;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @BelongsProject: easygo
 * @BelongsPackage: com.easygo.controller
 * @Author: bruceliu
 * @QQ:1241488705
 * @CreateTime: 2020-03-30 16:02
 * @Description: 首页控制器
 */
@Controller
@Scope("prototype")
public class IndexController {

    @Autowired
    ContentClient contentClient;

    @RequestMapping({"/","/index"})
    public String index(Model model){
        //查下轮播图广告
        getContents(model);
        //跳转首页
        return "index";
    }

    /**
     * 加载首页上需要的广告数据
     */
    public void getContents(Model model){
        //轮播图广告
        //把广告列表ID写到配置文件中
        List<Content> lunbo_contents = contentClient.getContentsByCategoryId(1);
        model.addAttribute("lunbo_contents",lunbo_contents);

        //生鲜楼层广告
        //List<Content> shenxian_contents = contentClient.getContentsByCategoryId(10);
        //model.addAttribute("shenxian_contents",shenxian_contents);

        //其他楼层广告
    }

}
