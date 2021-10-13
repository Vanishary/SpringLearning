package com.ssm.jdbc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * @author: GuoTao Li
 * @description: This is a description
 * @create: 2021年03月19日 02:34
 */
public class JdbcTemplateTest {
    public static void main(String[] args) {
        //加载配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("file:/Users/jp/Desktop/Document/Test/practice/src/main/java/com/ssm/aspectj/annotation/applicationContext.xml");
        //获取JdbcTemplate实例
        JdbcTemplate jdbcTemplate = (JdbcTemplate) applicationContext.getBean("jdbcTemplate");
        //使用execuate方法执行SQL语句，创建表
        jdbcTemplate.execute("create table user_new(" +
                "id int primary key auto_increment," +
                "username varchar(40)," +
                "password varchar(40))");
    }

    @Test
    public void addUserTest() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("file:/Users/jp/Desktop/Document/Test/practice/src/main/java/com/ssm/aspectj/annotation/applicationContext.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        User user = new User();
        user.setUsername("lisi");
        user.setPassword("123456");
        int num = userDao.addUser(user);
        if (num > 0) {
            System.out.println("成功插入了" + num + "条数据。");
        } else {
            System.out.println("插入操作执行失败");
        }
    }

    @Test
    public void updateUserTest() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("file:/Users/jp/Desktop/Document/Test/practice/src/main/java/com/ssm/aspectj/annotation/applicationContext.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        User user = new User();
        user.setId(1);
        user.setUsername("tom");
        user.setPassword("222222");
        int num = userDao.updateUser(user);
        if (num > 0) {
            System.out.println("成功更新了" + num + "条数据。");
        } else {
            System.out.println("更新操作执行失败");
        }
    }

    @Test
    public void deleteUserTest() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("file:/Users/jp/Desktop/Document/Test/practice/src/main/java/com/ssm/aspectj/annotation/applicationContext.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        User user = new User();
        int num = userDao.deleteUser(2);
        if (num > 0) {
            System.out.println("成功删除了" + num + "条数据。");
        } else {
            System.out.println("删除操作执行失败");
        }
    }

    @Test
    public void findUserByIdTest() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("file:/Users/jp/Desktop/Document/Test/practice/src/main/java/com/ssm/aspectj/annotation/applicationContext.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        User user = userDao.findUserById(3);
        System.out.println(user);
    }

    @Test
    public void findAllUserTest() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("file:/Users/jp/Desktop/Document/Test/practice/src/main/java/com/ssm/aspectj/annotation/applicationContext.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        List<User> list=userDao.findAllUser();
        System.out.println(list);
        for (User user:list){
            System.out.println(user);
        }
    }
}
