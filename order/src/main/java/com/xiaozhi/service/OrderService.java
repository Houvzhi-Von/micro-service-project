package com.xiaozhi.service;

import com.xiaozhi.dao.mapper.OrderMapper;
import com.xiaozhi.entity.Order;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;

/**
 * @author fenghouzhi
 * @date 2020/5/10 - 12:19 下午
 * @description: OrderService
 */
@Service
public class OrderService {

    @Resource
    private OrderMapper orderMapper;

    @Transactional(rollbackFor = RuntimeException.class)
    public String createOrder(Order order) {
        orderMapper.insertUseGeneratedKeys(order);
        Example example = new Example(Order.class);
        example.createCriteria().andEqualTo("id", order.getId());
        return orderMapper.selectOneByExample(example).getOrderNo();
    }

}