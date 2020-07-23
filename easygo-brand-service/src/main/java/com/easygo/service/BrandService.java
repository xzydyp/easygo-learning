package com.easygo.service;

import com.easygo.pojo.Brand;

import java.util.List;

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
}
