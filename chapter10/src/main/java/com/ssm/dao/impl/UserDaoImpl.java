package com.ssm.dao.impl;

import com.ssm.dao.UserDao;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import com.ssm.po.User;

/**
 * @author: GuoTao Li
 * @description: This is a description
 * @create: 2022年03月30日 10:24
 */
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

    @Override
    public User findUserById(Integer id) {
        return this.getSqlSession().selectOne("com.ssm.po.UserMapper.findUserById",id);
    }
}
