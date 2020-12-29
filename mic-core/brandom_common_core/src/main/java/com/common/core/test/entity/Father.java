package com.common.core.test.entity;

/**
 * 描述:
 *
 * @version 0.1
 * @Author liujian
 * @date 2020/12/29 15:46
 * @since JDK1.8
 */

public class Father {
    private final void f() { //即使这里你不显示的加上final,它隐式的就是final
        System.out.println("Father.f()");
    }
}
