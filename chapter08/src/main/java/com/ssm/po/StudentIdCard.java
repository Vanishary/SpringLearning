package com.ssm.po;

/**
 * @author: GuoTao Li
 * @description: This is a description
 * @create: 2022年03月20日 16:49
 */
public class StudentIdCard {
    private Integer id;
    private String code;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "StudentIdCard{" +
                "id=" + id +
                ", code='" + code + '\'' +
                '}';
    }
}
