package com.changgou.dao;

import com.changgou.goods.pojo.Spu;

import java.util.List;
import java.util.Map;

public interface SpuMapper {
    /***
     * 查询所有
     * @return
     */
    List<Spu> findAll();

    /**
     * 根据ID查询
     * @param id
     * @return
     */
    Spu findById(String id);

    /***
     * 新增
     * @param spu
     */
    void add(Spu spu);

    /***
     * 修改
     * @param spu
     */
    void update(Spu spu);

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
    List<Spu> findList(Map<String, Object> searchMap);
}
