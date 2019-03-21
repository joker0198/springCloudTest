package com.wh.springcloudtest.services.controllers;

import com.wh.springcloudtest.services.interfaces.DcClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author WangHong
 * @version 1.0.0
 * @ClassName DcController.java
 * @Description 服务消费（Feign）实例测试
 * @date 2019/3/20 13:45
 */
@RestController
public class DcController {

    @Resource
    private DcClient dcClient;

    @GetMapping("/consumer")
    public String dc() {
        return dcClient.consumer();
    }
}
