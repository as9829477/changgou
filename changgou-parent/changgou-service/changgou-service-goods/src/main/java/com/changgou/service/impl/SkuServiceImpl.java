package com.changgou.service.impl;

import com.changgou.goods.pojo.Sku;
import com.changgou.service.SkuService;
import com.github.pagehelper.Page;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class SkuServiceImpl implements SkuService {


    @Override
    public List<Sku> findAll() {
        return null;
    }

    @Override
    public Sku findById(String id) {
        return null;
    }

    @Override
    public void add(Sku sku) {

    }

    @Override
    public void update(Sku sku) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public List<Sku> findList(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public Page<Sku> findPage(int page, int size) {
        return null;
    }

    @Override
    public Page<Sku> findPage(Map<String, Object> searchMap, int page, int size) {
        return null;
    }
}
