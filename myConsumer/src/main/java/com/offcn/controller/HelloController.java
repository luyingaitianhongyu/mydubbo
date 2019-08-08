package com.offcn.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.offcn.service.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: Mr.路
 * @date: 2019/08/07 16:03
 */
//新增注释
@RestController
public class HelloController {
    @Reference
    private HelloService helloService;

    @RequestMapping("/hello")
    public String hello(String name){
        return helloService.sayHello(name);
    }
    @RequestMapping("/hello1")
    public void hello1(Integer age){
      helloService.sayHello(age);
    }
}
