package com.brandom.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.WeightedResponseTimeRule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 描述: ribbon客户端负载均衡策略
 *
 * @version 0.1
 * @Author liujian
 * @date 2020/12/29 14:47
 * @since JDK1.8
 */
@Configuration
public class MyRule {

    @Bean
    public IRule selfRule(){
        return new RandomRule();
    }
}
