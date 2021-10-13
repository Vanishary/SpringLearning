package com.ssm.aspectj;

import org.springframework.stereotype.Repository;

/**
 * @author: GuoTao Li
 * @description: This is a description
 * @create: 2021年03月17日 15:26
 */
@Repository("userDao")
public class UserDaopImpl implements UserDao {
    @Override
    public void addUser() {
//        int i=10/0;
        System.out.println("添加用户");
    }

    @Override
    public void deleteUser() {
        System.out.println("删除用户");
    }
}
