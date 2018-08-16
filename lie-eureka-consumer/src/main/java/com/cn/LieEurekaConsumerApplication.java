package com.cn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/***
 * @author
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class LieEurekaConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(LieEurekaConsumerApplication.class, args);
    }
}
