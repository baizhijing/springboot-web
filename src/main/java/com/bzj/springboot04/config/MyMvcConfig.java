package com.bzj.springboot04.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

/**
 * @Author:bai
 * @data:2019/1/28
 **/
@Configuration
public class MyMvcConfig extends WebMvcConfigurerAdapter {
//    @Override
//    public void addViewControllers(ViewControllerRegistry registry) {
//        //super.addViewControllers(registry);
//        registry.addViewController("/").setViewName("login");//根据请求名称/bzj，查找对应的页面success.html
//    }

////配置静态资源路径
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
//    }
//
//        //所有WebMvcConfigurerAdapter组件都会一起起作用
    @Bean //将组件注册进容器
    public WebMvcConfigurerAdapter webMvcConfigurerAdapter(){
        WebMvcConfigurerAdapter adapter = new WebMvcConfigurerAdapter(){
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                registry.addViewController("/").setViewName("login");
                registry.addViewController("/index.html").setViewName("login");
                registry.addViewController("/main.html").setViewName("dashboard");
            }

            @Override
            public void addInterceptors(InterceptorRegistry registry) {
                super.addInterceptors(registry);
            }
        };
        return adapter;
    }

}
