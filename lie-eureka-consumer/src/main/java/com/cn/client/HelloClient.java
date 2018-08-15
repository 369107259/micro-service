package com.cn.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("lie-server-client")
public interface HelloClient {

    @GetMapping("/hello")
    String consumer();
}
