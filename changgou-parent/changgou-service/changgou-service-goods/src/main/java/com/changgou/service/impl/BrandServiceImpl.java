package com.changgou.service.impl;

import com.changgou.dao.BrandMapper;
import com.changgou.goods.pojo.Brand;
import com.changgou.service.BrandService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandMapper brandMapper;

    @Override
    public List<Brand> selectBrand() {
        return brandMapper.selectBrand();
    }

    @Override
    public Brand findByBrand(int id) {
        return brandMapper.findByBrand(id);
    }

    @Override
    @Transactional
    public void insertBrand(Brand brand) {
        brandMapper.insertBrand(brand);
    }

    @Override
    public void updateBrand(Brand brand) {
        brandMapper.updateBrand(brand);
    }

    @Override
    public void deleteBrand(int id) {
        brandMapper.deleteBrand(id);
    }

    @Override
    public List<Brand> searchBrands(Brand brand) {
        return brandMapper.searchBrands(brand);
    }

    @Override
    public PageInfo findPageBrands(int page, int size) {

        PageHelper.startPage(page, size);

        List<Brand> list = brandMapper.selectBrand();
        return new PageInfo(list);
    }

    @Override
    public PageInfo searchPageBrands(int page, int size,Brand brand) {
        PageHelper.startPage(page, size);
        List<Brand> list = brandMapper.searchBrands(brand);
        return new PageInfo(list);
    }
}
