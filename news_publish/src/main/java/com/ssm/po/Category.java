package com.ssm.po;

/**
 * @Author: Guotao Li
 * @DateTime: 2022/4/11 4:18 下午
 * @Description: 新闻实体类
 */
public class Category {
    private Integer categoryId;  //新闻类别
    private String categoryName; //新闻类别名称

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryId=" + categoryId +
                ", categoryName='" + categoryName + '\'' +
                '}';
    }
}
