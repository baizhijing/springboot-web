package com.bzj.springboot04.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;
import java.util.Map;
import java.util.Arrays;

/**
 * @Author:bai
 * @data:2019/1/24
 **/


@Controller
public class HelloController {
//    @RequestMapping({"/","index.html"})
//    public String index(){
//        return "login";
//    }

    @ResponseBody
    @RequestMapping("/hello")
    public String Hello(){
        return "hello world";
    }

    @RequestMapping("/success")
    public String success(Map<String,Object> map){
        map.put("hello","<h1>您好</h1>");
        map.put("users", Arrays.asList("zhangsan","lisi","Wangwu"));
        return "success";
    }
}
