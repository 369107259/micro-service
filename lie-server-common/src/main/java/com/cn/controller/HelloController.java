package com.cn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/***
 * @author
 */
@RestController
public class HelloController {

    @GetMapping("/consumer")
    public String hello(){
        return  "hello word!";
    }
}
