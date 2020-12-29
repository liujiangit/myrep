package com.brandom.product.controller;

import java.net.URI;
import java.util.List;

import javax.annotation.Resource;

import com.brandom.product.loadbalance.LoadBalancer;
import com.common.core.entities.CommonResult;
import com.common.core.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * 描述:
 *
 * @version 0.1
 * @Author liujian
 * @date 2020/12/26 16:42
 * @since JDK1.8
 */
@RestController
@Slf4j
public class ProductController {

    public static final String PAYMENT_URL = "http://MALL-SRV";

    @Autowired
    private RestTemplate restTemplate;

    @Resource
    private DiscoveryClient discoveryClient;

    @Resource
    private LoadBalancer loadBalancer;

    @PostMapping("/comsumer/payment/create")
    public CommonResult<Payment> getPayment(@RequestBody Payment payment){
        /*ResponseEntity<CommonResult> entity = restTemplate.postForEntity(PAYMENT_URL + "/payment/create", payment, CommonResult.class);
        CommonResult commonResult = entity.getBody();*/
        return restTemplate.postForObject(PAYMENT_URL + "/payment/create",payment, CommonResult.class);
    }

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id){
        /*ResponseEntity<CommonResult> entity = restTemplate.getForEntity(PAYMENT_URL + "/payment/get/" + id, CommonResult.class);
        CommonResult commonResult = entity.getBody();
        HttpStatus statusCode = entity.getStatusCode();
        HttpHeaders headers = entity.getHeaders();
        System.out.println(JSON.toJSONString(commonResult));
        System.out.println(JSON.toJSONString(statusCode));
        System.out.println(JSON.toJSONString(headers));*/

        return restTemplate.getForObject(PAYMENT_URL+"/payment/get/"+id,CommonResult.class);
    }

    @GetMapping("/consumer/payment/getForEntity/{id}")
    public CommonResult<Payment> getPayment2(@PathVariable("id") Long id){
        ResponseEntity<CommonResult> entity = restTemplate.getForEntity(PAYMENT_URL+"/payment/get/"+id,CommonResult.class);
        if (entity.getStatusCode().is2xxSuccessful()){
            //  log.info(entity.getStatusCode()+"\t"+entity.getHeaders());
            return entity.getBody();
        }else {
            return new CommonResult<>(444,"操作失败");
        }
    }


    @GetMapping(value = "/consumer/payment/lb")
    public String getPaymentLB(){
        List<ServiceInstance> instances = discoveryClient.getInstances("MALL-SRV");
        if (instances == null || instances.size() <= 0){
            return null;
        }
        ServiceInstance serviceInstance = loadBalancer.instances(instances);
        URI uri = serviceInstance.getUri();
        return restTemplate.getForObject(uri+"/payment/lb",String.class);
    }

}
