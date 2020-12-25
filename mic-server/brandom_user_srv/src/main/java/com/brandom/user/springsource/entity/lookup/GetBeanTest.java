package com.brandom.user.springsource.entity.lookup;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public abstract class GetBeanTest {

    public void showMe(){
        this.getBean().showMe();
    }

    public abstract User getBean();

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("test/lookup/lookupTest.xml");
        GetBeanTest test = (GetBeanTest) applicationContext.getBean("getBeanTest");
        test.showMe();
    }
}
