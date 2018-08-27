package com.cn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/***
 * @author
 */
@EnableHystrixDashboard
@SpringCloudApplication
public class LieHystrixDashboardApplication {
    public static void main(String[] args) {
        SpringApplication.run(LieHystrixDashboardApplication.class, args);
    }
}
