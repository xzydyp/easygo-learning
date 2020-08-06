package com.easygo.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ContentMapperTest {
    @Autowired
    ContentMapper contentMapper;

    @Test
    public void getContents(){
        Map map=new HashMap();
        map.put("pageStart",0);
        map.put("pageSize",10);
        contentMapper.getContents(map).stream().forEach(System.out::println);

    }

}