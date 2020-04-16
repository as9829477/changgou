package com.changgou.service.impl;

import com.changgou.goods.pojo.Pref;
import com.changgou.service.PrefService;
import com.github.pagehelper.Page;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class PrefServiceImpl implements PrefService {


    @Override
    public List<Pref> findAll() {
        return null;
    }

    @Override
    public Pref findById(Integer id) {
        return null;
    }

    @Override
    public void add(Pref pref) {

    }

    @Override
    public void update(Pref pref) {

    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public List<Pref> findList(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public Page<Pref> findPage(int page, int size) {
        return null;
    }

    @Override
    public Page<Pref> findPage(Map<String, Object> searchMap, int page, int size) {
        return null;
    }
}
