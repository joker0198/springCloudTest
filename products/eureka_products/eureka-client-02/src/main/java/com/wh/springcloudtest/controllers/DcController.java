package com.wh.springcloudtest.controllers;


import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author WangHong
 * @version 1.0.0
 * @ClassName DcController.java
 * @Description EurekaClient测试Controller
 * @date 2019/3/20 10:49
 */
@RestController
public class DcController {

    @Resource
    private DiscoveryClient discoveryClient;

    @GetMapping("/dc")
    public String dc() {
        String services = "Services02: " + discoveryClient.getServices();
        System.out.println(services);
        return services;
    }
}
