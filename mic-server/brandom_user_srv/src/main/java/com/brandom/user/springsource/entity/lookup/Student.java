package com.brandom.user.springsource.entity.lookup;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

public class Student extends User implements MethodReplacer {

    @Override
    public void showMe() {
        System.out.println("i am student");
    }

    @Override
    public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
        //可以动态地替换方法.
        return null;
    }
}
