package com.baizhi.controller;

import com.baizhi.entity.Admin;
import com.baizhi.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("admin")
public class AdminController {
    @Autowired
    private AdminService adminService;
    @RequestMapping("query")
    @ResponseBody
    public List<Admin> query(){
        return adminService.findAll();
    }
}
