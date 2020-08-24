package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.service.IMessageProvider;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author gm-hacker
 * @create 2020-08-24 10:49
 */
@RestController
@Slf4j
public class SendMessageController {

    @Resource
    private IMessageProvider iMessageProvider;

    @GetMapping(value = "/sendMessage")
    public String sendMessage() {
        return iMessageProvider.send();
    }

}
