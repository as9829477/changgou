package com.changgou.dao;

import com.changgou.goods.pojo.Sku;

import java.util.List;
import java.util.Map;

public interface SkuMapper {
    /***
     * 查询所有
     * @return
     */
    List<Sku> findAll();

    /**
     * 根据ID查询
     * @param id
     * @return
     */
    Sku findById(String id);

    /***
     * 新增
     * @param sku
     */
    void add(Sku sku);

    /***
     * 修改
     * @param sku
     */
    void update(Sku sku);

    /***
     * 删除
     * @param id
     */
    void delete(String id);

    /***
     * 多条件搜索
     * @param searchMap
     * @return
     */
    List<Sku> findList(Map<String, Object> searchMap);
}
