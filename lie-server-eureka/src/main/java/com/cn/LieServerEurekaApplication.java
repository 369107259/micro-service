package com.cn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/***
 * @author huangyong
 */
@EnableEurekaServer
@SpringBootApplication
public class LieServerEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(LieServerEurekaApplication.class, args);
    }
}
