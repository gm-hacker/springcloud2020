package com.atguigu.springcloud.alibaba.domain;

import lombok.Data;

/**
 * @author gm-hacker
 * @create 2020-08-27 11:10
 */
@Data
public class Storage {

    private Long id;

    /**
     * 产品id
     */
    private Long productId;

    /**
     * 总库存
     */
    private Integer total;

    /**
     * 已用库存
     */
    private Integer used;

    /**
     * 剩余库存
     */
    private Integer residue;
}
