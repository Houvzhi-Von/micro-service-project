package com.xiaozhi.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xiaozhi.dto.CustomerAddDTO;
import com.xiaozhi.service.CustomerService;
import com.xiaozhi.vo.CustomerVO;
import dto.BaseQueryDTO;
import enums.ResultEnum;
import exception.ApiException;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
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
@Slf4j
@Api(tags = "客户 - API")
@RestController
@RequestMapping("/customer")
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
     * @param customerAddDTO
     * @return ResultVO
     */
    @ApiOperation(value = "新增客户")
    @PostMapping("")
    public ResultVO addCustomer(@RequestBody CustomerAddDTO customerAddDTO) {
        int addResult = customerService.addCustomer(customerAddDTO);
        if (addResult > 0) {
            return ResultVoUtil.success();
        } else {
            return ResultVoUtil.error(ResultEnum.FAILURE);
        }
    }

    @ApiOperation(value = "删除客户")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "customerId", paramType = "path", dataType = "Long")
    })
    @DeleteMapping("/{customerId}")
    public ResultVO deleteCustomer(@PathVariable Long customerId) {
        if (null == customerId) {
            throw new ApiException(ResultEnum.EMPTY);
        }
        int deleteResult = customerService.deleteCustomer(customerId);
        if (deleteResult > 0) {
            return ResultVoUtil.success();
        } else {
            return ResultVoUtil.error(ResultEnum.FAILURE);
        }
    }

}