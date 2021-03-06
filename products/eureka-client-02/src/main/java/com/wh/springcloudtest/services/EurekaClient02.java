package com.wh.springcloudtest.services;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author WangHong
 * @version 1.0.0
 * @ClassName EurekaClient02.java
 * @Description TODO
 * @date 2019/3/20 10:48
 */
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaClient02 {
    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaClient02.class).web(true).run(args);
    }
}
