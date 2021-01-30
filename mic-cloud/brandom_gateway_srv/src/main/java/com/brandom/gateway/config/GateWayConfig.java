package com.brandom.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 描述: 网关路由配置
 *
 * @version 0.1
 * @Author liujian
 * @date 2021/01/30 15:55
 * @since JDK1.8
 */
@Configuration
public class GateWayConfig {
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder) {
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes.route("path_rote_atguigu", r -> r.path("/guonei").uri("http://news.baidu.com/guonei"))
                .route("alibaba_routh", r -> r.path("/success").uri("https://blog.csdn.net/uotail/article/details/84404578")).build();
        return routes.build();
    }
}
