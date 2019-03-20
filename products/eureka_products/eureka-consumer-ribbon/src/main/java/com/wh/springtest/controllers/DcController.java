package com.wh.springtest.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author WangHong
 * @version 1.0.0
 * @ClassName DcController.java
 * @Description 服务消费Ribbon 实例
 * @date 2019/3/20 14:22
 */
@RestController
public class DcController {

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer")
    public String dc() {
        return restTemplate.getForObject("http://eureka-client/dc", String.class);
    }
}
