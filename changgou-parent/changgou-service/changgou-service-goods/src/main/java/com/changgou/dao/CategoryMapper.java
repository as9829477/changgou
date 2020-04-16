package com.changgou.dao;

import com.changgou.goods.pojo.Category;

import java.util.List;

public interface CategoryMapper {
    /***
     * 查询所有
     * @return
     */
    List<Category> findAll();

    /**
     * 根据ID查询
     * @param id
     * @return
     */
    Category findById(Integer id);

    /***
     * 新增
     * @param category
     */
    void add(Category category);

    /***
     * 修改
     * @param category
     */
    void update(Category category);

    /***
     * 删除
     * @param id
     */
    void delete(Integer id);

    /***
     * 多条件搜索
     * @param category
     * @return
     */
    List<Category> findList(Category category);
}
