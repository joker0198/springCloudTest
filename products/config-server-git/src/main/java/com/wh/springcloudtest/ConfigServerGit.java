package com.wh.springcloudtest;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author WangHong
 * @version 1.0.0
 * @ClassName ConfigServerGit.java
 * @Description 分布式配置中心 main
 * @date 2019/3/21 10:57
 */
@EnableConfigServer
@SpringBootApplication
public class ConfigServerGit {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ConfigServerGit.class).web(true).run(args);
    }
}
