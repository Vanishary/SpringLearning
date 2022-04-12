package com.ssm.dao;

import com.ssm.po.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: Guotao Li
 * @DateTime: 2022/4/6 11:09 上午
 * @Description: 用户DAO层接口
 */
public interface UserDao {
    //查询所有用户
    public List<User> selectUserList(@Param("keywords") String keywords, @Param("userListRoleId") Integer userListRoleId);

    //通过账号和密码查询用户
    public User findUser(@Param("loginName") String loginName, @Param("password") String password);

    //通过用户id查询用户
    public User getUserByUserId(Integer userId);

    //通过用户登录名查询用户是否存在
    public User getUserByLoginName(String LoginName);

    //添加用户
    public int addUser(User user);

    //更新用户
    public int updateUser(User user);

    //删除用户
    public int deleteUser(Integer userId);

    //设置用户状态（'1'：未启用；'2'：已启用；'3'：被禁用）
    public int setUserStatus(User user);
}
