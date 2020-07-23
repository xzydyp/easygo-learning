package com.easygo.controller;

import com.easygo.pojo.Brand;
import com.easygo.service.BrandService;
import org.apache.commons.beanutils.ConvertUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author:熊志阳
 * @date:2020/7/22
 * @description
 */
@RestController
@Scope("prototype")
public class BrandController {

    @Autowired
    private BrandService brandService;

    @RequestMapping("/brand/list/{name}")
    public List<Brand> getBrandList(@PathVariable String name){
        System.out.println(name);
        List<Brand> brandList = brandService.getBrandList();

        List<Integer> idList = brandList.stream().map(Brand::getId).collect(Collectors.toList());

        /*for(Brand brand:brandList){
            System.out.println(brand.toString());
        }*/
        //brandList.stream().forEach(System.out::println);
        //idList.stream().forEach(System.out::println);
        return brandList;
    }

    @RequestMapping("/brand_getBrands")
    public List<Brand> getBrands(){
        return brandService.getBrands();
    }

    @RequestMapping("/brand_add")
    public int addBrand(@RequestBody Brand brand){
        return brandService.addBrand(brand);
    }

    @RequestMapping("/brand_updateBrand")
    public int updateBrand(@RequestBody Brand brand){
        return brandService.updateBrand(brand);
    }

    @RequestMapping("/brand_getBrandById")
    public Brand getBrandById(@RequestParam Integer id){
        return brandService.getBrandById(id);
    }

    @RequestMapping("/brand_delete")
    public int deleteBrand(@RequestParam Integer id){

        return brandService.deleteBrand(id);
    }

    @RequestMapping("/brand_deleteSome")
    public int deleteSome(@RequestParam String ids){
        return brandService.deleteSome(ids);
    }

    @RequestMapping("/brand_deleteSome1")
    public int deleteSome1(@RequestParam String ids){
        String[] idArray = ids.split(",");
        Integer[] convert = (Integer[]) ConvertUtils.convert(idArray, Integer.class);
        return brandService.deleteSome1(convert);
    }

}
