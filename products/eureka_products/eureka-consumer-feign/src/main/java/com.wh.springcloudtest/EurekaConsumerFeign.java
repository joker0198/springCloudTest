package com.wh.springcloudtest;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author WangHong
 * @version 1.0.0
 * @ClassName EurekaConsumerFeign.java
 * @Description 服务消费（Feign）
 * @date 2019/3/20 13:44
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaConsumerFeign {

    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaConsumerFeign.class).web(true).run(args);
    }
}
