package com.wh.springcloudtest;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author WangHong
 * @version 1.0.0
 * @ClassName HystrixDashboardApplication.java
 * @Description 启用Hystrix Dashboard功能
 * @date 2019/3/28 9:34
 */
@EnableHystrixDashboard
@SpringCloudApplication
public class HystrixDashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboardApplication.class, args);
    }
}
