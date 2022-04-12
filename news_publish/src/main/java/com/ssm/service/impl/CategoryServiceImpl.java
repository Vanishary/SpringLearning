package com.ssm.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ssm.dao.CategoryDao;
import com.ssm.po.Category;
import com.ssm.service.CategoryService;

/**
 * @Author: Guotao Li
 * @DateTime: 2022/4/11 4:52 下午
 * @Description: TODO
 */
@Service("categoryService")
public class CategoryServiceImpl implements CategoryService {
    //注入RoleDao
    @Autowired
    private CategoryDao categoryDao;
    @Override
    public List<Category> findCategoryList() {
        return this.categoryDao.selectCategoryList();
    }
    @Override
    public Category findCategoryById(Integer categoryId) {
        return this.categoryDao.getCategoryById(categoryId);
    }

    @Override
    public int editCategory(Category category) {
        return this.categoryDao.updateCategory(category);
    }

    @Override
    public int addCategory(Category category) {
        return this.categoryDao.addCategory(category);
    }

    @Override
    public int deleteCategory(Integer categoryId) {
        return this.categoryDao.deleteCategory(categoryId);
    }
}
