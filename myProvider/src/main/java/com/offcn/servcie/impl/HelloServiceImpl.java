package com.offcn.servcie.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.offcn.service.HelloService;

/**
 * @description:
 * @author: Mr.路
 * @date: 2019/08/07 14:24
 */
@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return name+"欢迎来学习";
    }
}
