package com.changgou.service.impl;

import com.changgou.dao.TemplateMapper;


import com.changgou.goods.pojo.Template;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class TemplateServiceImpl implements TemplateMapper {

    @Override
    public List<Template> findAll() {
        return null;
    }

    @Override
    public Template findById(Integer id) {
        return null;
    }

    @Override
    public void add(Template template) {

    }

    @Override
    public void update(Template template) {

    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public List<Template> findList(Map<String, Object> searchMap) {
        return null;
    }
}
