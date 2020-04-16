package com.changgou.service.impl;

import com.changgou.goods.pojo.Para;
import com.changgou.service.ParaService;
import com.github.pagehelper.Page;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ParaServiceImpl implements ParaService {


    @Override
    public List<Para> findAll() {
        return null;
    }

    @Override
    public Para findById(Integer id) {
        return null;
    }

    @Override
    public void add(Para para) {

    }

    @Override
    public void update(Para para) {

    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public List<Para> findList(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public Page<Para> findPage(int page, int size) {
        return null;
    }

    @Override
    public Page<Para> findPage(Map<String, Object> searchMap, int page, int size) {
        return null;
    }
}
