package com.ssm.service;

import com.ssm.po.User;

/**
 * @Author: Guotao Li
 * @DateTime: 2022/4/2 12:28 上午
 * @Description: TODO
 */
public interface UserService {
    public User findUserById(Integer id);
}
