package com.xiaozhi.service;

import com.xiaozhi.dao.mapper.OrderMapper;
import org.springframework.stereotype.Service;

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

}