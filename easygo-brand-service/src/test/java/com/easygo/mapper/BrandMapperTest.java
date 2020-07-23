package com.easygo.mapper;

import com.easygo.pojo.Brand;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class BrandMapperTest {
    @Autowired
    private BrandMapper mapper;

    @Test
    public void getBrandList(){
        List<Brand> brandList = mapper.getBrandList();
        System.out.println(brandList.toString());
        System.out.println(123);
    }

    @Test
    public void getBrand(){
        int  id=1;
        Brand brand = mapper.getBrand(id);
        System.out.println(brand.toString());
    }

    @Test
    public void getBrands(){
        List<Brand> brands = mapper.getBrands();
        System.out.println(brands.get(0).toString());
    }
    @Test
    public void addBrand(){
        Brand brand=new Brand();
        brand.setName("熊大先生");
        int i = mapper.addBrand(brand);
        System.out.println(i);
    }

    @Test
    public void testGetByid(){
        Brand brand = mapper.getBrandById(1);
        System.out.println(brand);
    }

    @Test
    public void testSelect(){
        System.out.println("--------selectAll method test-------");
        List<Brand> brands = mapper.selectList(null);
        Assert.assertEquals(42,brands.size());
        brands.forEach(System.out::println);
    }

    @Test
    public void testUpdate(){
        Brand brand = mapper.getBrandById(1);
        System.out.println(brand);
        brand.setName("更新的测试");
        int count = mapper.updateBrand(brand);
        System.out.println(count>0?"更新成功":"更新失败");
    }

    @Test
    public void testDeleteSome(){
        String ids="10,11,12";
        int count = mapper.deleteSome(ids);
        System.out.println(count>0?"删除成功":"删除失败");
    }

    @Test
    public void testDeleteSome1(){
        Integer[] ids={20,21,22};
        int count = mapper.deleteSome1(ids);
        System.out.println(count>0?"删除成功":"删除失败");
    }

}