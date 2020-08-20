package com.atguigu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author gm-hacker
 * @create 2020-08-20 15:53
 */
@RestController
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private  String serverPort;

    @RequestMapping(value = "/payment/zk")
    public String payment() {
        return "springcloud with zookeeper: " + serverPort + "\t" + UUID.randomUUID().toString();
    }
}
