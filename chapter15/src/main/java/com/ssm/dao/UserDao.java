package com.ssm.dao;

import com.ssm.po.User;
import org.mybatis.spring.annotation.MapperScan;

/**
 * @Author: Guotao Li
 * @DateTime: 2022/4/2 12:23 上午
 * @Description: TODO
 */
public interface UserDao {
    /*
     * 根据id查询用户信息
     */
    public User findUserById(Integer id);
}
