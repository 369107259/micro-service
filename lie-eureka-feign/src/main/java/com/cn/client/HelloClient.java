package com.cn.client;

/**
 * @Author ${user}
 * @CreateTime 2018/8/28 17:37
 **/
public class HelloClient implements IHelloClient {
    @Override
    public String consumer() {
        return "fallback";
    }
}
