package com.easygo.mapper;

import com.easygo.pojo.ContentCategory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ContentCategoryMapperTest {

    @Autowired
    ContentCategoryMapper contentCategoryMapper;


    @Test
    public void getContentCategoryPages(){
        Map map=new HashMap();
        map.put("name","%广告%");
        map.put("pageStart",0);
        map.put("pageSize",10);
        List list = contentCategoryMapper.getContentCategoryPages(map);
        list.stream().forEach(System.out::println);
    }
}