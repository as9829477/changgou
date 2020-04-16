package com.changgou.service.impl;

import com.changgou.dao.CategoryMapper;
import com.changgou.goods.pojo.Category;
import com.changgou.service.CategoryService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public List<Category> findAll() {
        return categoryMapper.findAll();
    }

    @Override
    public Category findById(Integer id) {
        return categoryMapper.findById(id);
    }

    @Override
    public void add(Category category) {
        categoryMapper.add(category);
    }

    @Override
    public void update(Category category) {
        categoryMapper.update(category);
    }

    @Override
    public void delete(Integer id) {
        categoryMapper.delete(id);
    }

    @Override
    public List<Category> findList(Category category) {
        return categoryMapper.findList(category);
    }

    @Override
    public PageInfo<Category> findPage(int page, int size) {
        PageHelper.startPage(page, size);
        List<Category> categoryList = categoryMapper.findAll();
        return new PageInfo(categoryList);
    }

    @Override
    public PageInfo<Category> findPage(Category category, int page, int size) {
        PageHelper.startPage(page,size);
        List<Category> list = categoryMapper.findList(category);
        return new PageInfo(list);
    }
}
