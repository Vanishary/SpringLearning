package com.ssm.po;

import java.util.List;

public class UserVo {
    private List<User> users;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "UserVo{" +
                "users=" + users +
                '}';
    }
}
