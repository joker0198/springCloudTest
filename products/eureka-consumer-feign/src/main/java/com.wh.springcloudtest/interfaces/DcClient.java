package com.wh.springcloudtest.interfaces;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author WangHong
 * @version 1.0.0
 * @ClassName DcClient.java
 * @Description 服务消费（Feign）实例接口
 * @date 2019/3/20 15:25
 */
@FeignClient("eureka-client")
public interface DcClient {

    @GetMapping("/dc")
    String consumer();
}
