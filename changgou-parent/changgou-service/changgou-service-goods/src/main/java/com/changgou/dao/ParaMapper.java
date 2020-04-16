package com.changgou.dao;

import com.changgou.goods.pojo.Para;

import java.util.List;
import java.util.Map;

public interface ParaMapper{
    /***
     * 查询所有
     * @return
     */
    List<Para> findAll();

    /**
     * 根据ID查询
     * @param id
     * @return
     */
    Para findById(Integer id);

    /***
     * 新增
     * @param para
     */
    void add(Para para);

    /***
     * 修改
     * @param para
     */
    void update(Para para);

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
    List<Para> findList(Map<String, Object> searchMap);
}
