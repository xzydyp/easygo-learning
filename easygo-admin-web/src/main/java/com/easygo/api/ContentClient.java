package com.easygo.api;

import com.easygo.pojo.Content;
import com.easygo.utils.PageUtils;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @BelongsProject: easygo
 * @BelongsPackage: com.easygo.api
 * @Author: bruceliu
 * @QQ:1241488705
 * @CreateTime: 2020-03-30 15:02
 * @Description: TODO
 */
@FeignClient(value = "easygo-ad-service")
public interface ContentClient {

    @RequestMapping("/content_page")
     PageUtils<Content> getContent_page(@RequestParam(defaultValue = "1",value = "pageIndex", required = false) Integer pageIndex,
                                              @RequestParam(defaultValue = "5",value = "pageSize", required = false) Integer pageSize);

    @RequestMapping("/content_setStatus")
     void setStatus(@RequestParam(value = "id") Integer id );
}
