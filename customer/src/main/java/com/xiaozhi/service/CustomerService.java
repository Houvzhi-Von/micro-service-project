package com.xiaozhi.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xiaozhi.dao.mapper.CustomerMapper;
import com.xiaozhi.dto.CustomerDTO;
import com.xiaozhi.entity.Customer;
import com.xiaozhi.vo.CustomerVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;

/**
 * @author fenghouzhi
 * @date 2020/5/8 - 10:26 下午
 * @description: CustomerService
 */
@Slf4j
@Service
public class CustomerService {

    @Resource
    private CustomerMapper customerMapper;

    /**
     * 获取全部客户信息
     *
     * @return
     */
    public List<CustomerVO> getCustomerVOList() {
        return customerMapper.getCustomerVOList();
    }

    /**
     * 新增客户
     */
    public Integer addCustomer(CustomerDTO customerDTO) {
        Customer customer = new Customer();
        BeanUtils.copyProperties(customerDTO, customer);
        log.info("insertSelective param info:   {}", customer);
        return customerMapper.insertSelective(customer);
    }

}