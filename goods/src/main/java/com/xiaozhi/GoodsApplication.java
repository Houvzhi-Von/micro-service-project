package com.xiaozhi;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;
import util.IpUtil;

/**
 * @author fenghouzhi
 * @date 2020/5/9 - 1:24 下午
 * @description: 商品服务 - 启动类
 */
@Slf4j
@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.xiaozhi.dao.mapper")
public class GoodsApplication {

    public static void main(String[] args) {
        SpringApplication.run(GoodsApplication.class, args);
        log.info("Goods Service run ...");
        log.info("ip address:   {}", IpUtil.getLocalIP());
    }

}