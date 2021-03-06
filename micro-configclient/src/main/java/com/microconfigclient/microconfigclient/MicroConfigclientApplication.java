package com.microconfigclient.microconfigclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@RefreshScope
public class MicroConfigclientApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroConfigclientApplication.class, args);
    }

}
