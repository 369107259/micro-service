package com.cn.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/***
 * @author huangyong
 */
@FeignClient("lie-server-client")
public interface HelloService {
    @RequestMapping("/hello")
    String hello(@RequestParam("name")String name);
}
