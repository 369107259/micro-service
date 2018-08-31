package com.cn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/***
 * @author
 * @SpringCloudApplication
 */
@EnableFeignClients
@SpringBootApplication
@EnableDiscoveryClient
public class LieEurekaFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(LieEurekaFeignApplication.class, args);
    }
}
