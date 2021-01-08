package com.brandom.product.entity;

/**
 * 描述:
 *
 * @version 0.1
 * @Author liujian
 * @date 2021/01/08 11:56
 * @since JDK1.8
 */

public class Forest implements Runnable {
    @Override
    public void run() {
        System.out.println("runable");
    }

    public static void main(String[] args) {
        Forest forest = new Forest();
        new Thread(forest).start();
    }
}
