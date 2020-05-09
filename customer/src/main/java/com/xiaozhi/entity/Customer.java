package com.xiaozhi.entity;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author fenghouzhi
 * @date 2020/5/8 - 6:55 下午
 * @description: 客户 - 实体类
 */
@Data
@Table(name = "t_customer_info")
public class Customer implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @Id
    @KeySql(useGeneratedKeys = true)
    private Long id;

    /**
     * 客户姓名
     */
    private String customerName;

    /**
     * 收货地址
     */
    private String customerAddress;

    /**
     * 删除标识
     */
    private Integer deleteFlag;

}