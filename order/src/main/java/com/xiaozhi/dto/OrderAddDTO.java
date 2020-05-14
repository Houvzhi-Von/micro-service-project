package com.xiaozhi.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author fenghouzhi
 * @date 2020/5/10 - 9:36 下午
 * @description: 订单 - 新增入参类
 */
@Data
@ApiModel(value = "订单 - 新增入参类")
public class OrderAddDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 订单编号
     */
    @ApiModelProperty(value = "订单编号")
    private String orderNo;

    /**
     * 下单客户ID
     */
    @ApiModelProperty(value = "下单客户ID")
    private Long orderCustomerId;

    /**
     * 订单类型 0: PC订单 1: 小程序订单
     */
    @ApiModelProperty(value = "订单类型", allowableValues = "0 , 1")
    private Integer orderType;

    /**
     * 下单时间
     */
    @ApiModelProperty(value = "下单时间")
    private Date orderCreateTime;

}