package com.jxkj.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 功能描述：
 *
 * @author wcx
 * @version 1.0
 */
@Configuration
public class GatewayRouteConfig {
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        RouteLocatorBuilder.Builder routes = builder.routes();
        // 进行路由转发
        routes.route("path-baidu-guonei", r -> r.path("/guonei").uri("http://news.baidu.com/guonei")).build();
        routes.route("path-baidu-guoji", r -> r.path("/guoji").uri("http://news.baidu.com/guoji")).build();

        // 产品的路由匹配规则
        routes.route("product-route", r -> r.path("/api/product/**")
                .filters(f -> f.rewritePath("/api/(?<segment>/?.*)", "/$\\{segment}"))
                .uri("lb://mall-product"))
                .build();
        // 第三方产品的路由匹配规则
        routes.route("third-party-route", r -> r.path("/api/thirdparty/**")
                .filters(f -> f.rewritePath("/api/thirdparty/(?<segment>/?.*)","/$\\{segment}"))
        .uri("lb://mall-third-party")).build();

        // 后台的路由匹配规则
        routes.route("admin-route", r -> r.path("/api/**")
                .filters(f -> f.rewritePath("/api/(?<segment>/?.*)", "/mall-admin/$\\{segment}"))
                .uri("lb://mall-admin"))
                .build();
        return routes.build();
    }
}
