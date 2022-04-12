package com.ssm.service;

import com.ssm.po.Category;
import com.ssm.po.User;

import java.util.List;

/**
 * @Author: Guotao Li
 * @DateTime: 2022/4/11 4:51 下午
 * @Description: 新闻类别Service层接口
 */
public interface CategoryService {
    public List<Category> findCategoryList();
    public Category findCategoryById(Integer categoryId);
    public int editCategory(Category category);
    public int addCategory(Category category);
    public int deleteCategory(Integer categoryId);
}
