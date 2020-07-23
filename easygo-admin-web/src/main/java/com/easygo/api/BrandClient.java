package com.easygo.api;

import com.easygo.pojo.Brand;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @BelongsProject: easygo
 * @BelongsPackage: com.easygo.api
 * @Author: bruceliu
 * @QQ:1241488705
 * @CreateTime: 2020-03-27 11:26
 * @Description: TODO
 */
@FeignClient(value = "easygo-brand-service")
public interface BrandClient {

    @RequestMapping("/brand_getBrands")
     List<Brand> getBrands();

    @RequestMapping("/brand_add")
     int addBrand(@RequestBody Brand brand);

    @RequestMapping("/brand_getBrandById")
     Brand getBrandById(@RequestParam(value = "id") Integer id);

    @RequestMapping("/brand_updateBrand")
     int updateBrand(@RequestBody Brand brand);

    @RequestMapping("/brand_delete")
     int deleteBrand(@RequestParam(value = "id") Integer id);

    @RequestMapping("/brand_deleteSome")
     int deleteSome(@RequestParam(value = "ids") String ids);
}
