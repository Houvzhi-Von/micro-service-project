package com.xiaozhi.handle;

/**
 * @author fenghouzhi
 * @date 2020/5/10 - 9:26 下午
 * @description: 订单 Handler - OrderHandle
 */
public interface OrderHandle<T> {

    /**
     * 获取实现类类型
     *
     * @return String
     */
    Integer getImplClassType();

    /**
     * 创建订单
     *
     * @param t
     * @return String
     */
    String createOrder(T t);

}