package com.ssm.po;

import java.util.List;

/**
 * @author: GuoTao Li
 * @description: This is a description
 * @create: 2022年03月20日 16:51
 */
public class Student {
    private Integer id;
    private String name;
    private String sex;
    private StudentIdCard studentIdCard;
    private List<Course> courseList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public StudentIdCard getStudentIdCard() {
        return studentIdCard;
    }

    public void setStudentIdCard(StudentIdCard studentIdCard) {
        this.studentIdCard = studentIdCard;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", studentIdCard=" + studentIdCard +
                ", courseList=" + courseList +
                '}';
    }
}
