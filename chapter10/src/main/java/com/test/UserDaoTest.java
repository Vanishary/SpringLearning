package com.test;

import com.ssm.dao.UserDao;
import com.ssm.mapper.UserMapper;
import com.ssm.po.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: GuoTao Li
 * @description: This is a description
 * @create: 2022年03月30日 10:50
 */
public class UserDaoTest {
    @Test
    public void findUserByIdDaoTest1() {
        //1.初始化Spring容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.通过容器获取userDao实例
        UserDao userDao = (UserDao)applicationContext.getBean("userDao");
        //3.调用UserDao接口查询
        User user = userDao.findUserById(1);
        System.out.println(user.toString());
    }

    @Test
    public void findUserByIdDaoTest2() {
        //1.初始化Spring容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.通过容器获取userMapper实例
        UserMapper userMapper = (UserMapper) applicationContext.getBean("userMapper");
        //3.调用实例中findUserById方法查询
        User user = userMapper.findUserById(1);
        System.out.println(user.toString());
    }
}
