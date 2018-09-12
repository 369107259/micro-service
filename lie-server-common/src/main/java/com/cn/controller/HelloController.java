package com.cn.controller;

import com.cn.entity.User;
import com.cn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/***
 * @author
 */
@RestController
public class HelloController {
    @Autowired
    private UserService userService;

    @GetMapping("/consumer")
    public String hello(){
        return  "hello word!";
    }

    @GetMapping("/user")
    public String getUser(Long id){
        User user = userService.selectByPrimaryKey(id);
        return  user.getUserName();
    }
}
