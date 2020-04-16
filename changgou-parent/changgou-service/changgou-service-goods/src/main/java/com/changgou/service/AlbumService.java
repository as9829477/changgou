package com.changgou.service;

import com.changgou.goods.pojo.Album;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface AlbumService {

    /***
     * 查询所有
     * @return
     */
    List<Album> findAll();

    /**
     * 根据ID查询
     * @param id
     * @return
     */
    Album findById(Long id);

    /***
     * 新增
     * @param album
     */
    void add(Album album);

    /***
     * 修改
     * @param album
     */
    void update(Album album);

    /***
     * 删除
     * @param id
     */
    void delete(Long id);

    /***
     * 多条件搜索
     * @param album
     * @return
     */
    List<Album> findList(Album album);

    /***
     * 分页查询
     * @param page
     * @param size
     * @return
     */
    PageInfo<Album> findPage(int page, int size);

    /***
     * 多条件分页查询
     * @param album
     * @param page
     * @param size
     * @return
     */
    PageInfo<Album> findPage(Album album, int page, int size);




}
