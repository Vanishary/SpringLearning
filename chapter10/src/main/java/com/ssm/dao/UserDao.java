package com.ssm.dao;

import com.ssm.po.User;

/**
 * @author: GuoTao Li
 * @description: This is a description
 * @create: 2022年03月30日 10:42
 */
public interface UserDao {
    public User findUserById(Integer id);
}
