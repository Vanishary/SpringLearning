package com.ssm.po;

import java.util.Date;

/**
 * @Author: Guotao Li
 * @DateTime: 2022/4/6 10:29 上午
 * @Description: 用户实体类
 */
public class User {
    private Integer userId;     //用户id
    private String userName;    //用户姓名
    private String loginName;   //用户登录名
    private String password;    //用户登录密码(优化密码强度校验)
    private String tel;         //联系电话(限制手机，在公共方法中增加输入判断)
    private Date registerTime;  //注册或修改用户时间(项目优化时启用updateTime字段 )
//    private Date updateTime;    //最近一次修改时间
    private String status;      //用户状态（'1'：未启用；'2'：已启用；'3'：被禁用）
    private Integer roleId;     //用户对应角色id
    private String roleName;    //用户对应角色名称

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

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

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", loginName='" + loginName + '\'' +
                ", password='" + password + '\'' +
                ", tel='" + tel + '\'' +
                ", registerTime=" + registerTime +
                ", status='" + status + '\'' +
                ", roleId=" + roleId +
                ", roleName='" + roleName + '\'' +
                '}';
    }
}
