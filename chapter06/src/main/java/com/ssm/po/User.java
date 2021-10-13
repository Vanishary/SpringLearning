package com.ssm.po;

/**
 * @author: GuoTao Li
 * @description: This is a description
 * @create: 2021年10月13日 15:21
 */
public class User {
    private Integer id; //用户id
    private String username; //用户姓名
    private String jobs; //用户职业
    private String phone; //用户电话号码

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getJobs() {
        return jobs;
    }

    public void setJobs(String jobs) {
        this.jobs = jobs;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User[" +
                "id=" + id +
                ", username='" + username +
                ", jobs='" + jobs +
                ", phone='" + phone +
                ']';
    }
}
