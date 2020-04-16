package com.changgou.dao;

import com.changgou.goods.pojo.Spec;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface SpecMapper {

    @Select("SELECT name,options FROM tb_spec WHERE template_id in(SELECT template_id FROM tb_category WHERE name=#{categoryName})")
    public List<Map> findSpecListByCategoryName(@Param("categoryName") String categoryName);

    /***
     * 查询所有
     * @return
     */
    List<Spec> findAll();

    /**
     * 根据ID查询
     * @param id
     * @return
     */
    Spec findById(Integer id);

    /***
     * 新增
     * @param spec
     */
    void add(Spec spec);

    /***
     * 修改
     * @param spec
     */
    void update(Spec spec);

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
    List<Spec> findList(Map<String, Object> searchMap);

}
