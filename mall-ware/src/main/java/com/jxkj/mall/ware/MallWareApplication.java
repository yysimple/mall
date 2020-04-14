package com.jxkj.mall.ware;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 功能描述：
 *
 * @author wcx
 * @version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.jxkj.mall.ware.dao")
public class MallWareApplication {
    public static void main(String[] args) {
        SpringApplication.run(MallWareApplication.class, args);
    }
}
