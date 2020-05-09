package com.xiaozhi.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xiaozhi.dto.CustomerDTO;
import com.xiaozhi.service.CustomerService;
import com.xiaozhi.vo.CustomerVO;
import dto.BaseQueryDTO;
import enums.ResultEnum;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;
import util.ResultVoUtil;
import vo.ResultVO;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;

/**
 * @author fenghouzhi
 * @date 2020/5/8 - 3:05 下午
 * @description: 客户 - API
 */
@RestController
@RequestMapping("/customer")
@Api(tags = "客户 - API")
public class CustomerController {

    @Resource
    private CustomerService customerService;

    /**
     * 查询客户信息
     *
     * @return ResultVO<CustomerVO>
     */
    @ApiOperation(value = "查询客户信息")
    @PostMapping("/list")
    public ResultVO<PageInfo<CustomerVO>> getCustomersByQueryParam(@RequestBody BaseQueryDTO baseQueryDTO) {
        PageHelper.startPage(baseQueryDTO.getPageNum(), baseQueryDTO.getPageSize());
        List<CustomerVO> customerVOList = customerService.getCustomerVOList();
        if (CollectionUtils.isEmpty(customerVOList)) {
            return ResultVoUtil.success(Collections.EMPTY_LIST);
        }
        return ResultVoUtil.success(new PageInfo<>(customerVOList));
    }

    /**
     * 新增客户
     *
     * @param customerDTO
     * @return ResultVO
     */
    @ApiOperation(value = "新增客户")
    @PostMapping("")
    public ResultVO addCustomer(@RequestBody CustomerDTO customerDTO) {
        int addResult = customerService.addCustomer(customerDTO);
        if (addResult > 0) {
            return ResultVoUtil.success();
        } else {
            return ResultVoUtil.error(ResultEnum.FAILURE);
        }
    }

}