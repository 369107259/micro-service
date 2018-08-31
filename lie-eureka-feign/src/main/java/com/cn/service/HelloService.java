package com.cn.service;

import com.cn.client.IHelloClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/***
 * @author  huangyong
 */
@Service
public class HelloService {
    @Autowired
    private IHelloClient helloClient;

    public String consumer() {
       return helloClient.consumer();
    }
}
