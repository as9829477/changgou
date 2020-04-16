package com.changgou.service.impl;

import com.changgou.goods.pojo.Spu;
import com.changgou.service.SpuService;
import com.github.pagehelper.Page;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class SpuServiceImpl implements SpuService {


    @Override
    public List<Spu> findAll() {
        return null;
    }

    @Override
    public Spu findById(String id) {
        return null;
    }

    @Override
    public void add(Spu spu) {

    }

    @Override
    public void update(Spu spu) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public List<Spu> findList(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public Page<Spu> findPage(int page, int size) {
        return null;
    }

    @Override
    public Page<Spu> findPage(Map<String, Object> searchMap, int page, int size) {
        return null;
    }
}
