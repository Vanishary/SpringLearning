package com.ssm.dao;

import com.ssm.po.Role;
import com.ssm.po.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: Guotao Li
 * @DateTime: 2022/4/6 11:09 上午
 * @Description: 角色DAO层接口
 */
public interface RoleDao {
    //获取所有角色列表
    public List<Role> selectRoleList();
    //根据角色ID获取角色及其关联的用户
    public Role selectRoleWithUsers(@Param("roleId") Integer roleId);
}
