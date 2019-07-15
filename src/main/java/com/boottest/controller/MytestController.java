package com.boottest.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.boottest.service.TestService;
import com.google.common.util.concurrent.RateLimiter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: wangk
 * @Date: 2018/12/17 15:36
 */
@Controller
@RequestMapping("/test")
public class MytestController {
//http://localhost:8080/test/demo

    @Autowired
    private TestService testService;

    //添加mybatis-plus插件进行分页查询

    @RequestMapping("/demo")
    @ResponseBody
    String test() {

        Page<String> p = new Page(1,3);

        String name = testService.demo(p);


        return name;
    }


    public static void main(String[] args) {

        RateLimiter rateLimiter = RateLimiter.create(100);

    }

}
