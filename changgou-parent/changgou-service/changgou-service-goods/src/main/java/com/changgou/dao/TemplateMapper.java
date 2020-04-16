package com.changgou.dao;

import com.changgou.goods.pojo.Template;

import java.util.List;
import java.util.Map;

public interface TemplateMapper {
    /***
     * 查询所有
     * @return
     */
    List<Template> findAll();

    /**
     * 根据ID查询
     * @param id
     * @return
     */
    Template findById(Integer id);

    /***
     * 新增
     * @param template
     */
    void add(Template template);

    /***
     * 修改
     * @param template
     */
    void update(Template template);

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
    List<Template> findList(Map<String, Object> searchMap);
}
