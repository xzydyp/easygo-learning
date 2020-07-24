package com.easygo.mapper;

import com.easygo.pojo.Admin;
import com.netflix.discovery.converters.Auto;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class AdminMapperTest {

    @Autowired
    AdminMapper adminMapper;

    @Test
    public void adminLogin(){
        Admin admin=new Admin();
        admin.setId(1);
        admin.setUsername("admin");
        admin.setPassword("123");
        Admin admin1 = adminMapper.adminlogin(admin);
        Assert.assertNotNull(admin1);
    }

}