package com.xiaozhi.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.Data;

import javax.persistence.Table;

/**
 * @author fenghouzhi
 * @date 2020/5/10 - 12:13 下午
 * @description:
 */
@Data
@Table(name = "t_goods_info")
public class Goods implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    private Long id;

    /**
     * 商品名称
     */
    private String goodsName;

    /**
     * 商品编号
     */
    private String goodsNo;

    /**
     * 商品规格
     */
    private String goodsSpec;

    /**
     * 商品单价
     */
    private BigDecimal goodsPrice;

    /**
     * 删除标识  0：未删除  1：已删除
     */
    private Integer deleteFlag;

}