package com.jxkj.mall.thirdparty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * 功能描述：
 *
 * @author wcx
 * @version 1.0
 */
@EnableDiscoveryClient
@SpringBootApplication
public class MallThirdPartyApplication {
    public static void main(String[] args) {
        SpringApplication.run(MallThirdPartyApplication.class, args);
    }
}
