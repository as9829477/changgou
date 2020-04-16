package com.changgou.service.impl;

import com.changgou.dao.AlbumMapper;
import com.changgou.goods.pojo.Album;
import com.changgou.service.AlbumService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumServiceImpl implements AlbumService {

    @Autowired
    private AlbumMapper albumMapper;

    @Override
    public List<Album> findAll() {
        return albumMapper.findAll();
    }

    @Override
    public Album findById(Long id) {
        return albumMapper.findById(id);
    }

    @Override
    public void add(Album album) {
        albumMapper.add(album);
    }

    @Override
    public void update(Album album) {
        albumMapper.update(album);
    }

    @Override
    public void delete(Long id) {
        albumMapper.delete(id);
    }

    @Override
    public List<Album> findList(Album album) {
        return albumMapper.findList(album);
    }

    @Override
    public PageInfo findPage(int page, int size) {
        PageHelper.startPage(page, size);
        List<Album> list = albumMapper.findAll();

        return  new PageInfo(list);
    }

    @Override
    public PageInfo<Album> findPage(Album album, int page, int size) {
        PageHelper.startPage(page,size);
        List<Album> list = albumMapper.findList(album);
        return new PageInfo<Album>(list);
    }
}
