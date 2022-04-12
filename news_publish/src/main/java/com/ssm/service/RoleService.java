package com.ssm.service;

import com.ssm.po.Role;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Guotao Li
 * @DateTime: 2022/4/6 4:55 下午
 * @Description: 角色Service层接口
 */
public interface RoleService {
    public List<Role> findRoleList();
    public Role findRoleWithUsersByRoleId(Integer roleId);
}
