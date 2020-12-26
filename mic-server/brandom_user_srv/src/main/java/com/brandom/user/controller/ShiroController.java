package com.brandom.user.controller;

import com.alibaba.fastjson.JSON;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述:
 *
 * @version 0.1
 * @Author liujian
 * @date 2020/12/26 15:51
 * @since JDK1.8
 */
@RestController
public class ShiroController {

    @GetMapping(value = "shiro/getString")
    public String test(@RequestParam(value = "name",required = false) String name){
        String hello = JSON.toJSONString("hello");
        System.out.println(hello);
        System.out.println(name);
        return "hello, world";
    }
}
