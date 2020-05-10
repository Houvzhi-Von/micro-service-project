package com.xiaozhi.handle.impl;

import com.xiaozhi.dto.OrderAddDTO;
import com.xiaozhi.entity.Order;
import com.xiaozhi.enums.OrderTypeEnum;
import com.xiaozhi.handle.OrderHandle;
import com.xiaozhi.service.OrderService;
import enums.DeleteFlagEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;
import util.UuidUtil;

import javax.annotation.Resource;

/**
 * @author fenghouzhi
 * @date 2020/5/10 - 9:35 下午
 * @description: 小程序订单实现策略类 - MiniAppOrderImpl
 */
@Slf4j
@Component
public class MiniAppOrderImpl implements OrderHandle<OrderAddDTO> {

    @Resource
    private OrderService orderService;

    @Override
    public Integer getImplClassType() {
        return OrderTypeEnum.MINI_APP_ORDER.ordinal();
    }

    @Override
    public String createOrder(OrderAddDTO orderAddDTO) {
        Order order = new Order();
        BeanUtils.copyProperties(orderAddDTO, order);
        order.setOrderNo(UuidUtil.generateUuid());
        order.setDeleteFlag(DeleteFlagEnum.NO_DELETE.ordinal());
        log.info("MiniApp createOrder param info: {}", order);
        return orderService.createOrder(order);
    }

}