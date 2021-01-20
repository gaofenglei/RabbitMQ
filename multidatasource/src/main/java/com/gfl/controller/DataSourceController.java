package com.gfl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Controller
public class DataSourceController {

    //测试@Primary属性
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping("/testPrimary")
    @ResponseBody
    public List testPrimary() {
        jdbcTemplate.update(" insert into orders(id,order_num,create_Date) values(?,?,?) ",new Object[]{1,"萧峰1",new Date()});
        List<String> list=new ArrayList<>();
        list.add("success");
        return list;
    }

    //测试多数据源
    @Autowired
    @Qualifier("db1JdbcTemplate")
    private JdbcTemplate db1JdbcTemplate;
    @Autowired
    @Qualifier("db2JdbcTemplate")
    private JdbcTemplate db2JdbcTemplate;

    @RequestMapping("/contextLoads")
    public List contextLoads() {

        db1JdbcTemplate.update(" insert into orders(id,a) values(?,?) ",new Object[]{UUID.randomUUID().toString(),"萧峰1"});
        db2JdbcTemplate.update(" insert into orders(id,a) values(?,?) ",new Object[]{UUID.randomUUID().toString(),"萧峰1"});
        List<String> list=new ArrayList<>();
        list.add("success");
        return list;
    }

}
