package com.xiaozhi.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author fenghouzhi
 * @date 2020/5/10 - 11:56 上午
 * @description: 订单类型 - 枚举
 */
@Getter
@AllArgsConstructor
public enum OrderTypeEnum {

    /**
     * PC订单
     */
    PC_ORDER("PC订单"),

    /**
     * 小程序订单
     */
    MINI_APP_ORDER("小程序订单");

    private final String orderTypeName;

}