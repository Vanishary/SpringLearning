package com.ssm.mapper;

import com.ssm.po.User;

/**
 * @author: GuoTao Li
 * @description: This is a description
 * @create: 2022年03月30日 14:23
 */
public interface UserMapper {
    public User findUserById(Integer id);
}
