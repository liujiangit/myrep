package com.brandom.user.springsource;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.util.Assert;

/**
 * 描述:
 *
 * @version 0.1
 * @Author liujian
 * @date 2020/12/25 18:08
 * @since JDK1.8
 */

public class SpringTest {

    public static void main(String[] args) {
        XmlBeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("springApplication.xml"));
        Student student = (Student) beanFactory.getBean("student");
        System.out.println(student.getName());
        Assert.notNull(null, "EncodedResource must not be null");

    }
}
