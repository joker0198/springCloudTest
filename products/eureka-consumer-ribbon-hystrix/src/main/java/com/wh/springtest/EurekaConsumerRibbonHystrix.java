package com.wh.springtest;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author WangHong
 * @version 1.0.0
 * @ClassName EurekaConsumerRibbonHystrix.java
 * @Description 服务消费Ribbon 主函数
 * @date 2019/3/20 14:21
 */
@EnableCircuitBreaker
@SpringCloudApplication
public class EurekaConsumerRibbonHystrix {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaConsumerRibbonHystrix.class).web(true).run(args);
    }
}
