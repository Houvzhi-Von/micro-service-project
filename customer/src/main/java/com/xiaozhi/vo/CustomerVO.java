package com.xiaozhi.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author fenghouzhi
 * @date 2020/5/8 - 11:00 下午
 * @description: 客户 - 视图类
 */
@Data
@ApiModel(description = "客户 - 视图类")
public class CustomerVO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @ApiModelProperty(value = "主键ID")
    private Long id;

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