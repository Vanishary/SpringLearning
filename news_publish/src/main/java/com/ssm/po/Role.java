package com.ssm.po;

import java.util.List;

/**
 * @Author: Guotao Li
 * @DateTime: 2022/4/6 10:26 上午
 * @Description: 角色实体类
 */
public class Role {
    private Integer roleId;     //角色ID
    private String roleName;   //角色名称
    private List<User> userList;   //对应角色的用户列表

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    @Override
    public String toString() {
        return "Role{" +
                "roleId=" + roleId +
                ", roleName=" + roleName +
                ", userList=" + userList +
                '}';
    }
}
