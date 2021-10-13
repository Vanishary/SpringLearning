package com.ssm.aspectj.xml;

import com.ssm.aspectj.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: GuoTao Li
 * @description: This is a description
 * @create: 2021年03月17日 16:58
 */
public class TestXmlAspectJ {
    public static void main(String[] args) {
        String xmlPath = "file:/Users/jp/Desktop/Document/Test/practice/src/main/java/com/ssm/aspectj/xml/applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        UserDao userDao = (UserDao)applicationContext.getBean("userDao");
        userDao.addUser();
        userDao.deleteUser();
    }
}
