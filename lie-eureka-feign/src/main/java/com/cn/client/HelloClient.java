package com.cn.client;

import org.springframework.stereotype.Component;

/**
 * @Author ${user}
 * @CreateTime 2018/8/28 17:37
 **/
@Component
public class HelloClient implements IHelloClient {
    @Override
    public String consumer() {
        return "fallback";
    }
}
