package com.cn.controller;

import com.cn.client.HelloClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/***
 * @author
 */
@RestController
public class HelloController {

    @Autowired
    private HelloClient helloClient;

    @GetMapping("/consumer")
    public String hello(){
        return  helloClient.consumer();
    }
}
