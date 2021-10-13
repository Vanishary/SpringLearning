package com.ssm.jdbc;

import java.util.List;

/**
 * @author: GuoTao Li
 * @description: This is a description
 * @create: 2021年03月23日 15:53
 */
public interface UserDao {
    public int addUser(User user);

    public int updateUser(User user);

    public int deleteUser(int id);

    public User findUserById(int id);

    public List<User> findAllUser();

    public void transfer(String outUser, String inUser, Integer jf);
}
