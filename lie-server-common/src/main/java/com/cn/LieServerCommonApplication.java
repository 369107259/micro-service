package com.cn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

/***
 * @author huangyong
 */
@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.cn.mapper")
public class LieServerCommonApplication {

    public static void main(String[] args) {
        SpringApplication.run(LieServerCommonApplication.class, args);
    }
}
