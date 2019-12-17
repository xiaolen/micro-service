package com.example.microfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
//负载均衡
@EnableFeignClients
public class MicroFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroFeignApplication.class, args);
    }

}
