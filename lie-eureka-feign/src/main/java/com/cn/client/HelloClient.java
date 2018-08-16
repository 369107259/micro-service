package com.cn.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/***
 * @author
 */
@FeignClient("lie-server-client")
public interface HelloClient {

    /***
     * 调用服务方的接口
     * @return
     */
    @GetMapping("/hello")
    String consumer();
}
