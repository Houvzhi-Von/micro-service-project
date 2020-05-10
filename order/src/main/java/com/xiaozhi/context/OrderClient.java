package com.xiaozhi.context;

import com.xiaozhi.dto.OrderAddDTO;
import com.xiaozhi.enums.OrderTypeEnum;
import com.xiaozhi.handle.OrderHandle;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author fenghouzhi
 * @date 2020/5/10 - 10:14 下午
 * @description: 订单 Handler 执行类 - OrderClient
 */
@Component
public class OrderClient<T> implements InitializingBean {

    @Resource
    private ApplicationContextHelper applicationContextHelper;

    private Map<Integer, OrderHandle> orderHandleMap = new ConcurrentHashMap<>();

    @Override
    public void afterPropertiesSet() throws Exception {
        Map<String, OrderHandle> beansOfType = applicationContextHelper.getBeansOfType(OrderHandle.class);
        beansOfType.forEach((s, orderHandle) -> {
            orderHandleMap.put(orderHandle.getImplClassType(), orderHandle);
        });
    }

    public String doHandler(Integer orderType, OrderAddDTO orderAddDTO) {
        return orderHandleMap.get(orderType).createOrder(orderAddDTO);
    }

}