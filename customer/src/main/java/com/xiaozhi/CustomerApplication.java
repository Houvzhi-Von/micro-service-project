package com.xiaozhi;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;
import util.IpUtil;

/**
 * @author fenghouzhi
 * @date 2020/5/8 - 2:58 下午
 * @description: 客户服务 - 启动类
 */
@Slf4j
@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.xiaozhi.dao.mapper")
public class CustomerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerApplication.class, args);
        log.info("Customer Service run ...");
        log.info("ip address:   {}", IpUtil.getLocalIP());
    }

}