package com.cn.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/***
 * @author
 */
@FeignClient(value = "lie-server-client",fallback = HelloClient.class)
public interface IHelloClient {

    /***
     * 调用服务方的接口
     * @return
     */
    @GetMapping("/hello")
    String consumer();
}