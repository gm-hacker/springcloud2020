package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author gm-hacker
 * @create 2020-08-21 10:44
 */
@SpringBootApplication
@EnableFeignClients
public class OrderFeignMain80{

    public static void main(String[] args) {
        SpringApplication.run(OrderFeignMain80.class, args);
    }
}
