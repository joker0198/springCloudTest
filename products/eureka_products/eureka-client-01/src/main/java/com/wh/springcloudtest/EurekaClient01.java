package com.wh.springcloudtest;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author WangHong
 * @version 1.0.0
 * @ClassName EurekaClient01.java
 * @Description TODO
 * @date 2019/3/20 10:48
 */
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaClient01 {
    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaClient01.class).web(true).run(args);
    }
}
