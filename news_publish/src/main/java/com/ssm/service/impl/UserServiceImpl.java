package com.ssm.service.impl;

import com.ssm.dao.UserDao;
import com.ssm.po.User;
import com.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Guotao Li
 * @DateTime: 2022/4/6 5:04 下午
 * @Description: 用户service接口实现类
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    //注入UserDao
    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findUserList(String keywords, Integer userListRoleId) {
        List<User> userList = this.userDao.selectUserList(keywords, userListRoleId);
        return userList;
    }

    @Override
    public User findUser(String loginName, String password) {
        User user = this.userDao.findUser(loginName, password);
        return user;
    }

    @Override
    public User getUserByUserId(Integer userId) {
        User user=this.userDao.getUserByUserId(userId);
        return user;
    }

    @Override
    public User getUserByLoginName(String loginName) {
        User user=this.userDao.getUserByLoginName(loginName);
        return user;
    }

    @Override
    public int editUser(User user) {
        return this.userDao.updateUser(user);
    }

    @Override
    public int addUser(User user) {
        return this.userDao.addUser(user);
    }

    @Override
    public int deleteUser(Integer userId) {
        return this.userDao.deleteUser(userId);
    }

    @Override
    public int setUserStatus(User user) {
        return this.userDao.setUserStatus(user);
    }
}
