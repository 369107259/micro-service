package com.cn.controller;

import com.cn.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/***
 * @author
 */
@RestController
public class HelloController {

    @Resource
    private HelloService helloService;

    @GetMapping("/hello")
    public String hello(){
        return  helloService.hello("huangYong");
    }
}
