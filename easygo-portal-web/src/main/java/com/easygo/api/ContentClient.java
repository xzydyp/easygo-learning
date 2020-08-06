package com.easygo.api;

import com.easygo.pojo.Content;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @BelongsProject: easygo
 * @BelongsPackage: com.easygo.api
 * @Author: bruceliu
 * @QQ:1241488705
 * @CreateTime: 2020-03-30 16:12
 * @Description: TODO
 */
@FeignClient(value = "easygo-ad-service")
public interface ContentClient {

    @RequestMapping("/content_getContentsByCategoryId")
     List<Content> getContentsByCategoryId(@RequestParam(value = "categoryId") Integer categoryId);
}
