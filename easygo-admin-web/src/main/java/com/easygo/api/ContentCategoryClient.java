package com.easygo.api;

import com.easygo.pojo.ContentCategory;
import com.easygo.utils.PageUtils;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @BelongsProject: easygo
 * @BelongsPackage: com.easygo.api
 * @Author: bruceliu
 * @QQ:1241488705
 * @CreateTime: 2020-03-30 10:51
 * @Description: TODO
 */
@FeignClient(value = "easygo-ad-service")
public interface ContentCategoryClient {

    @RequestMapping("/contentCategory_delete")
     int deleteContentCategory(@RequestParam(value = "id") Integer id);

    @RequestMapping("/contentCategory_deleteSome")
    int deleteSomeContentCategory(@RequestParam(value = "ids") String ids);


    @RequestMapping("/contentCategory_update")
     int updateContentCategory(@RequestBody ContentCategory contentCategory);

    @RequestMapping("/contentCategory_getById")
     ContentCategory getById(@RequestParam(value = "id") Integer id);

    @RequestMapping("/contentCategory_add")
     int addContentCategory(@RequestBody ContentCategory contentCategory);

    @RequestMapping("/contentCategory_page")
     PageUtils<ContentCategory> getcontentCategorys(@RequestParam(defaultValue = "1",value = "pageIndex",required = false) Integer pageIndex, @RequestParam(defaultValue = "5",value = "pageSize", required = false) Integer pageSize,
                                                          @RequestParam(defaultValue = "",value = "name", required = false) String name);
}
