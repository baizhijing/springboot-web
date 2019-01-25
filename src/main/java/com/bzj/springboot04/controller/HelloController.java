package com.bzj.springboot04.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @Author:bai
 * @data:2019/1/24
 **/


@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping("/hello")
    public String Hello(){
        return "hello world";
    }

    @RequestMapping("/success")
    public String success(Map<String,Object> map){
        map.put("hello","您好");
        return "success";
    }
}
