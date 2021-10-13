package com.ssm.test;

import com.ssm.po.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.apache.ibatis.io.Resources;

import java.io.InputStream;

/**
 * @author: GuoTao Li
 * @description: This is a description
 * @create: 2021年10月13日 16:42
 */
public class MybatisTest {
    @Test
    public void findUserByIdTest() throws Exception {
        String resource = "mybatis-config.xml";

        InputStream inputStream = Resources.getResourceAsStream(resource);

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        User user = sqlSession.selectOne("com.ssm.mapper.UserMapper.findUserById", 1);

        System.out.println(user.toString());

        sqlSession.close();
    }
}
