package com.wh.springcloudtest.services;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author WangHong
 * @version 1.0.0
 * @ClassName EurekaConsumer.java
 * @Description 服务消费main
 * @date 2019/3/20 13:44
 */
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaConsumer {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaConsumer.class).web(true).run(args);
    }
}
