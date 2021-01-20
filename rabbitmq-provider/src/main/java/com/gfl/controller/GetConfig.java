package com.gfl.controller;

/*获取配置文件中的值*/

import com.gfl.config.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetConfig {

    @Autowired
    private Config config;

    @RequestMapping("test")
    public String test(){
        System.out.println(config.getHost()+"-----"+config.getPort()+"-----"+config.getPassword()+"-----"+config.getUsername());
        return "";
    }

}
