package com.xiaozhi.entity;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * @author fenghouzhi
 * @date 2020/5/10 - 12:13 下午
 * @description:
 */
@Data
@Table(name = "t_order")
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @Id
    @KeySql(useGeneratedKeys = true)
    private Long id;

    /**
     * 订单编号
     */
    private String orderNo;

    /**
     * 下单客户ID
     */
    private Long orderCustomerId;

    /**
     * 订单类型 0: PC订单 1: 小程序订单
     */
    private Integer orderType;

    /**
     * 下单时间
     */
    private Date orderCreateTime;

    /**
     * 删除标识  0：未删除  1：已删除
     */
    private Integer deleteFlag;

}