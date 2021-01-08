package com.brandom.product.entity;

/**
 * 描述:
 *
 * @version 0.1
 * @Author liujian
 * @date 2021/01/08 11:31
 * @since JDK1.8
 */

public class Annimal extends Thread {

    public static void  eat(String foo){
        System.out.println(foo);
    }

 /*   public void  eat(String foo,int age){
        eat("dd","dd");
        System.out.println(foo);
    }*/
    public static void  eat(String foo,String water){
        System.out.println(foo + water);
    }

    @Override
    public void run() {
        System.out.println("nimei");
    }

    public static void main(String[] args) {
        Annimal annimal = new Annimal();
        annimal.eat("dd");
        annimal.start();
    }

}
