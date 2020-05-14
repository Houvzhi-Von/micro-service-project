package com.xiaozhi.dao.base;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author fenghouzhi
 * @date 2020/5/8 - 6:52 下午
 * @description: 提供给自己的 MyMapper 继承
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}