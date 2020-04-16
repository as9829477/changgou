package com.changgou.service;

import com.changgou.goods.pojo.Log;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface LogService {

    /***
     * 查询所有
     * @return
     */
    List<Log> findAll();

    /**
     * 根据ID查询
     * @param id
     * @return
     */
    Log findById(Long id);

    /***
     * 新增
     * @param log
     */
    void add(Log log);

    /***
     * 修改
     * @param log
     */
    void update(Log log);

    /***
     * 删除
     * @param id
     */
    void delete(Long id);

    /***
     * 多条件搜索
     * @param log
     * @return
     */
    List<Log> findList(Log log);

    /***
     * 分页查询
     * @param page
     * @param size
     * @return
     */
    PageInfo<Log> findPage(int page, int size);

    /***
     * 多条件分页查询
     * @param log
     * @param page
     * @param size
     * @return
     */
    PageInfo<Log> findPage(Log log, int page, int size);




}
