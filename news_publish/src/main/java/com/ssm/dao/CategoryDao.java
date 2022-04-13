package com.ssm.dao;

import com.ssm.po.Category;
import com.ssm.po.User;

import java.util.List;

/**
 * @Author: Guotao Li
 * @DateTime: 2022/4/11 4:35 下午
 * @Description: 新闻类别DAO层接口
 */
public interface CategoryDao {
    //查询所有新闻类别
    public List<Category> selectCategoryList();

    //根据新闻类别ID查询新闻类别
    public Category getCategoryById(Integer categoryId);

    //根据新闻类别名称查询新闻类别
    public Category getCategoryByName(String categoryName);

    //添加新闻类别
    public int addCategory(Category category);

    //更新新闻类别
    public int updateCategory(Category category);

    //删除新闻类别
    public int deleteCategory(Integer categoryId);
}
