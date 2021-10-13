package com.ssm.jdbc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: GuoTao Li
 * @description: This is a description
 * @create: 2021年10月10日 15:22
 */
public class TransactionTest {
    @Test
    public void xmlTest() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("file:/Users/jp/Desktop/Document/Test/practice/src/main/java/com/ssm/aspectj/annotation/applicationContext.xml");
        UserDao userDao = (UserDao)applicationContext.getBean("userDao");

        //赠送积分
        userDao.transfer("zhangsan", "lisi", 100);
        System.out.println("赠送积分成功！");
    }

    @Test
    public void annotationTest() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("file:/Users/jp/Desktop/Document/Test/practice/src/main/java/com/ssm/aspectj/annotation/applicationContext-annotation.xml");
        UserDao userDao = (UserDao)applicationContext.getBean("userDao");

        //赠送积分
        userDao.transfer("zhangsan", "lisi", 100);
        System.out.println("赠送积分成功！");
    }
}
