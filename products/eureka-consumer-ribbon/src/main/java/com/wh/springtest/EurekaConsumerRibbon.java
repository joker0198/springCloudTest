package com.wh.springtest;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author WangHong
 * @version 1.0.0
 * @ClassName EurekaConsumerRibbon.java
 * @Description 服务消费Ribbon 主函数
 * @date 2019/3/20 14:21
 */
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaConsumerRibbon {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaConsumerRibbon.class).web(true).run(args);
    }
}
