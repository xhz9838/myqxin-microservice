package com.myqxin.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author xuhongzu
 * @date 2020/10/29
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class FaceApplication {
    public static void main(String[] args) {
        SpringApplication.run(FaceApplication.class, args);
    }
}
