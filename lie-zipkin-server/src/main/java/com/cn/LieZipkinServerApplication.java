package com.cn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

/**
 * @author
 */
@EnableZipkinServer
@SpringBootApplication
public class LieZipkinServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(LieZipkinServerApplication.class, args);
    }
}
