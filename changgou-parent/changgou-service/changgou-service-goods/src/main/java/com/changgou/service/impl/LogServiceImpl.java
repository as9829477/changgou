package com.changgou.service.impl;

import com.changgou.dao.LogMapper;
import com.changgou.goods.pojo.Log;
import com.changgou.service.LogService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogServiceImpl implements LogService {

    @Autowired
    private LogMapper logMapper;

    @Override
    public List<Log> findAll() {
        return logMapper.findAll();
    }

    @Override
    public Log findById(Long id) {
        return logMapper.findById(id);
    }

    @Override
    public void add(Log log) {
        logMapper.add(log);
    }

    @Override
    public void update(Log log) {
        logMapper.update(log);
    }

    @Override
    public void delete(Long id) {
        logMapper.delete(id);
    }

    @Override
    public List<Log> findList(Log log) {
        return logMapper.findList(log);
    }

    @Override
    public PageInfo<Log> findPage(int page, int size) {
        PageHelper.startPage(page,size);
        List<Log> logList = logMapper.findAll();
        return new PageInfo(logList);
    }

    @Override
    public PageInfo<Log> findPage(Log log, int page, int size) {
        PageHelper.startPage(page,size);
        List<Log> logList = logMapper.findList(log);
        return new PageInfo(logList);
    }
}
