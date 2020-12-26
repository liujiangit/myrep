package com.brandom.product.controller;

import com.alibaba.fastjson.JSON;

/**
 * 描述:
 *
 * @version 0.1
 * @Author liujian
 * @date 2020/12/26 16:42
 * @since JDK1.8
 */

public class ProductTestController {

    public static void main(String[] args) {
        String hello = JSON.toJSONString("hello");
        System.out.println(hello);
    }
}
