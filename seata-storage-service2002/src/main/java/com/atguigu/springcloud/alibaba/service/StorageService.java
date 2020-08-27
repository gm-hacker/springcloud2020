package com.atguigu.springcloud.alibaba.service;

/**
 * @author gm-hacker
 * @create 2020-08-27 11:14
 */
public interface StorageService {
    /**
     * 扣减库存
     */
    void decrease(Long productId, Integer count);
}
