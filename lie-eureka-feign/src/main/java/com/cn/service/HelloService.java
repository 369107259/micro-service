package com.cn.service;

import com.cn.client.IHelloClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/***
 * @author  huangyong
 */
@Service
public class HelloService {
    @Autowired
    private IHelloClient helloClient;

    @HystrixCommand(fallbackMethod = "fallback")
    public String consumer() {
       return helloClient.consumer();
    }

    public String fallback(){
        return "fallback";
    }
}
