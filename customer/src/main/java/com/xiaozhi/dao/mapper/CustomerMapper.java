package com.xiaozhi.dao.mapper;

import com.xiaozhi.dao.base.MyMapper;
import com.xiaozhi.entity.Customer;
import com.xiaozhi.vo.CustomerVO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author fenghouzhi
 * @date 2020/5/8 - 10:24 下午
 * @description: CustomerMapper
 */
@Repository
public interface CustomerMapper extends MyMapper<Customer> {

    /**
     * 查询客户信息
     *
     * @return CustomerVO
     */
    List<CustomerVO> getCustomerVOList();

}