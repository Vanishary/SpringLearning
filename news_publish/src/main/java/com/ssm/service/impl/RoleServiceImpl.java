package com.ssm.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ssm.dao.RoleDao;
import com.ssm.po.Role;
import com.ssm.service.RoleService;

/**
 * @Author: Guotao Li
 * @DateTime: 2022/4/6 5:01 下午
 * @Description: 角色Service接口实现类
 */
@Service("roleService")
public class RoleServiceImpl implements RoleService {
    //注入RoleDao
    @Autowired
    private RoleDao roleDao;
    @Override
    public List<Role> findRoleList() {
        List<Role> roleList=roleDao.selectRoleList();
        return roleList;
    }
    @Override
    public Role findRoleWithUsersByRoleId(Integer roleId) {
        Role role=roleDao.selectRoleWithUsers(roleId);
        return role;
    }
}
