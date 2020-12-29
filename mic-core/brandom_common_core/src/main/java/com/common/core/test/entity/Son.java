package com.common.core.test.entity;

/**
 * 描述:
 *
 * @version 0.1
 * @Author liujian
 * @date 2020/12/29 15:48
 * @since JDK1.8
 */

public class Son extends Father {



    private final void f() { //看上去象不象覆盖??
        System.out.println("Son.f()");
    }

    void test() {
        f();
    }

    public static void main(String[] a) {
        new Son().test();

    }
}
