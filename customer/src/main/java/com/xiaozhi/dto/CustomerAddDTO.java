package com.xiaozhi.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author fenghouzhi
 * @date 2020/5/8 - 11:01 下午
 * @description: 客户 - 新增入参类
 */
@Data
@ApiModel(value = "客户 - 新增入参类")
public class CustomerAddDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 客户姓名
     */
    @ApiModelProperty(value = "客户姓名")
    private String customerName;

    /**
     * 收货地址
     */
    @ApiModelProperty(value = "收货地址")
    private String customerAddress;

}