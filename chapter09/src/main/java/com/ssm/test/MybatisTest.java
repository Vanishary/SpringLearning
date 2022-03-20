package com.ssm.test;

import com.ssm.po.User;
import com.ssm.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.apache.ibatis.io.Resources;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: GuoTao Li
 * @description: This is a description
 * @create: 2021年10月13日 16:42
 */
public class MybatisTest {
    @Test
    public void findUserByIdTest() throws Exception {
        String resource = "src/main/resources/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        User user = sqlSession.selectOne("com.ssm.mapper.UserMapper.findUserById", 1);

        System.out.println(user.toString());

        sqlSession.close();
    }

    @Test
    public void findUserById2Test() throws Exception {
        String resource = "src/main/resources/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        User user = sqlSession.selectOne("com.ssm.mapper.UserMapper.findUserById2", 1);

        System.out.println(user.toString());

        sqlSession.close();
    }

    @Test
    public void findUserByNameTest() throws Exception {
        String resource = "src/main/resources/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        List<User> users = sqlSession.selectList("com.ssm.mapper.UserMapper.findUserByName", "g");

        for (User user : users) {
            System.out.println(user.toString());
        }

        sqlSession.close();
    }

    @Test
    public void addUserTest() throws Exception {
        String resource = "src/main/resources/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        User user = new User();
        user.setUsername("tom");
        user.setJobs("worker");
        user.setPhone("13542555642");

        int rows = sqlSession.insert("com.ssm.mapper.UserMapper.addUser", user);

        if (rows > 0) {
            System.out.println("成功添加" + rows + "条数据！");
        } else {
            System.out.println("添加数据失败！");
        }

        sqlSession.commit();

        sqlSession.close();
    }

    @Test
    public void updateUserTest() throws Exception {
        String resource = "src/main/resources/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        User user = new User();
        user.setId(5);
        user.setUsername("tom");
        user.setJobs("teacher");
        user.setPhone("13542555642");

        int rows = sqlSession.insert("com.ssm.mapper.UserMapper.updateUser", user);

        if (rows > 0) {
            System.out.println("成功添加" + rows + "条数据！");
        } else {
            System.out.println("添加数据失败！");
        }

        sqlSession.commit();

        sqlSession.close();
    }

    @Test
    public void deleteUserTest() throws Exception {
        String resource = "src/main/resources/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        int rows = sqlSession.insert("com.ssm.mapper.UserMapper.deleteUser", 5);

        if (rows > 0) {
            System.out.println("成功删除" + rows + "条数据！");
        } else {
            System.out.println("删除数据失败！");
        }

        sqlSession.commit();

        sqlSession.close();
    }

    @Test
    public void findUserByNameAndJobsTest() throws Exception {
        SqlSession sqlSession = MyBatisUtil.getSession();
        User user = new User();
        user.setUsername("zhangsan");
        user.setJobs("teacher");
        List<User> users =
                sqlSession.selectList("com.ssm.mapper.UserMapper.findUserByNameAndJobs", user);
        for (User u : users) {
            System.out.println(u.toString());
        }
        sqlSession.close();
    }

    @Test
    public void findUserByIdsTest() throws Exception {
        SqlSession sqlSession = MyBatisUtil.getSession();
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(6);
        List<User> users =
                sqlSession.selectList("com.ssm.mapper.UserMapper.findUserByIds", list);
        for (User u : users) {
            System.out.println(u.toString());
        }
        sqlSession.close();
    }
}
