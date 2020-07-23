package com.easygo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.easygo.pojo.Brand;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author:熊志阳
 * @date:2020/7/21
 * @description
 */
@Mapper
 public interface BrandMapper extends BaseMapper<Brand> {

    @Select("select * from tb_brand limit 10")
    List<Brand> getBrandList();

    @Select("select id,name from tb_brand where id=#{id}")
    @Results(id = "result",value = {
            @Result(property = "id",column = "id"),
            @Result(property = "name",column = "name")
    })
    Brand getBrand(@Param("id") int id);

    List<Brand> getBrands();

    int addBrand(Brand brand);

    int updateBrand(Brand brand);

    Brand getBrandById(Integer id);

    int deleteBrand(Integer id);

    int deleteSome(@Param("ids") String ids);

    int deleteSome1(Integer[] ids);
}
