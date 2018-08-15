package com.cn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/***
 * @author huangyong
 */
@EnableDiscoveryClient
@SpringBootApplication
public class LieServerClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(LieServerClientApplication.class, args);
    }
}
