package com.xiaozhi.handle;

import com.xiaozhi.dto.OrderAddDTO;

/**
 * @author fenghouzhi
 * @date 2020/5/10 - 9:26 下午
 * @description: 订单 Handler - OrderHandle
 */
public interface OrderHandle {

    /**
     * 获取实现类类型
     *
     * @return String
     */
    Integer getImplClassType();

    /**
     * 创建订单
     *
     * @param orderAddDTO
     * @return String
     */
    String createOrder(OrderAddDTO orderAddDTO);

}