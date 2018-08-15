package com.cn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/***
 * @author
 */
@RestController
public class HelloController {

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer")
    public String hello(){
        ServiceInstance serviceInstance = loadBalancerClient.choose("lie-server-client");
        String url = "http://localhost:" + serviceInstance.getPort() + "/hello";
        System.out.println(url);
        return  restTemplate.getForObject(url,String.class);
    }
}
