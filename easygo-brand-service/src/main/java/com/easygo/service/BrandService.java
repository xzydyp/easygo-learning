package com.easygo.service;

import com.easygo.pojo.Brand;

import java.util.List;
import java.util.Map;

public interface BrandService {
    /**
     * 获取品牌列表
     * @return
     */
    List<Brand> getBrandList();

     List<Brand> getBrands();

     int addBrand(Brand brand);

     int updateBrand(Brand brand);

     Brand getBrandById(Integer id);

     int deleteBrand(Integer id);

     int deleteSome(String ids);

     int deleteSome1(Integer[] ids);

     //查询总条数(没有条件)
      int getTotalCount();

     //查询每页的数据(没有条件)
      List<Brand> getPageBrands(Map<String,Object> map);
}
