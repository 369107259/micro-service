package com.cn.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Administrator
 * @CreateTime 2019/5/27 17:36
 **/
@Slf4j
@RestController
public class HelloController {
//    @GetMapping("/hello")
//    public String hello(@RequestParam String name) {
//        log.info("invoked name = " + name);
//        return "hello " + name;
//    }

    @RequestMapping("/hello")
    public String hello(@RequestParam("name") String name) {
        return "Hello " + name + ", this is nacos-provider message.";
    }
}
