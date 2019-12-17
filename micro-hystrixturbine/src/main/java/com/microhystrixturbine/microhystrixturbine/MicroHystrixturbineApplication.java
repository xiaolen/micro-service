package com.microhystrixturbine.microhystrixturbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
//trubin配置
@EnableTurbine
//激活dashboard
@EnableHystrixDashboard
public class MicroHystrixturbineApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroHystrixturbineApplication.class, args);
    }

}
