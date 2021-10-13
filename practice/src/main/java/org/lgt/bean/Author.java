package org.lgt.bean;

/**
 * @author: GuoTao Li
 * @description: This is a description
 * @create: 2020年10月29日 21:15
 */
public class Author {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {

        return "BOOK{name='" + getName() + ",age=" + getAge() + "}";
    }
}
