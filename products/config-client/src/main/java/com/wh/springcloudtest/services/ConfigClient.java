package com.wh.springcloudtest.services;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @author WangHong
 * @version 1.0.0
 * @ClassName ConfigClient.java
 * @Description 分布式配置中心 测试类
 * @date 2019/3/21 11:54
 */
@SpringBootApplication
public class ConfigClient {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ConfigClient.class).web(true).run(args);
    }
}
