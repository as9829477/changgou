package com.changgou.service.impl;

import com.changgou.goods.pojo.Spec;
import com.changgou.service.SpecService;
import com.github.pagehelper.Page;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class SpecServiceImpl implements SpecService {

    @Override
    public List<Spec> findAll() {
        return null;
    }

    @Override
    public Spec findById(Integer id) {
        return null;
    }

    @Override
    public void add(Spec spec) {

    }

    @Override
    public void update(Spec spec) {

    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public List<Spec> findList(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public Page<Spec> findPage(int page, int size) {
        return null;
    }

    @Override
    public Page<Spec> findPage(Map<String, Object> searchMap, int page, int size) {
        return null;
    }

    @Override
    public List<Map> findSpecListByCategoryName(String categoryName) {
        return null;
    }
}
