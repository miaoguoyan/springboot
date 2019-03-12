package com.baizhi.test;

import com.baizhi.application;
import com.baizhi.dao.AdminDao;
import com.baizhi.entity.Admin;
import com.baizhi.service.AdminService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = application.class)
public class TestAdmin {
    @Autowired
    private AdminDao adminDao;
    @Autowired
    private AdminService adminService;
    @Test
    public void test1(){
        List<Admin> admins = adminDao.queryAll();
        for (Admin admin : admins) {
            System.out.println(admin);
        }
    }
    @Test
    public void test2(){
        List<Admin> admins = adminService.findAll();
        for (Admin admin : admins) {
            System.out.println(admin);
        }
    }
}
