package com.ssm.service.impl;

import com.ssm.dao.UserDao;
import com.ssm.po.User;
import com.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: Guotao Li
 * @DateTime: 2022/4/2 12:29 上午
 * @Description: TODO
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {
    //注解注入UserDao
    @Autowired
    private UserDao userDao;
    //查询客户
    public User findUserById(Integer id) {
        return this.userDao.findUserById(id);
    }
}
