package com.brandom.product.loadbalance;

import java.util.List;

import org.springframework.cloud.client.ServiceInstance;

/**
 * 描述: 负载均衡接口
 *
 * @version 0.1
 * @Author liujian
 * @date 2020/12/29 15:25
 * @since JDK1.8
 */

public interface LoadBalancer {
    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
