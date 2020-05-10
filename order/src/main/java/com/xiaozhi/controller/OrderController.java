package com.xiaozhi.controller;

import com.xiaozhi.context.OrderClient;
import com.xiaozhi.dto.OrderAddDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import util.ResultVoUtil;
import vo.ResultVO;

import javax.annotation.Resource;

/**
 * @author fenghouzhi
 * @date 2020/5/10 - 12:01 下午
 * @description: 订单 - API
 */
@Slf4j
@Api(tags = "订单 - API")
@RestController
@RequestMapping("/order")
public class OrderController {

    @Resource
    private OrderClient orderClient;

    @ApiOperation(value = "创建订单")
    @PostMapping("")
    public ResultVO createOrder(@RequestBody OrderAddDTO orderAddDTO) {
        return ResultVoUtil.success(orderClient.doHandler(orderAddDTO.getOrderType(), orderAddDTO));
    }

}