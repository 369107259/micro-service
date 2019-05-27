package com.cn;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

/***
 * @author huangyong
 */
@EnableDiscoveryClient
@SpringBootApplication
public class LieServerClientApplication {

    public static void main(String[] args) {

        SpringApplication.run(LieServerClientApplication.class, args);

//        System.out.println("请在控制台指定client服务的端口号 —— [端口号随意指定，注意不要与本机端口号出现冲突即可]");
//        Scanner scanner = new Scanner(System.in);
//        //让用户指定端口号
//        String port = scanner.nextLine();
//        //启动项目
//        new SpringApplicationBuilder(LieServerClientApplication.class).properties("server.port=" + port).run(args);
    }
}
