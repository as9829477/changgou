package com.changgou.dao;

import com.changgou.goods.pojo.Pref;

import java.util.List;
import java.util.Map;

public interface PrefMapper{
    /***
     * 查询所有
     * @return
     */
    List<Pref> findAll();

    /**
     * 根据ID查询
     * @param id
     * @return
     */
    Pref findById(Integer id);

    /***
     * 新增
     * @param pref
     */
    void add(Pref pref);

    /***
     * 修改
     * @param pref
     */
    void update(Pref pref);

    /***
     * 删除
     * @param id
     */
    void delete(Integer id);

    /***
     * 多条件搜索
     * @param searchMap
     * @return
     */
    List<Pref> findList(Map<String, Object> searchMap);
}
