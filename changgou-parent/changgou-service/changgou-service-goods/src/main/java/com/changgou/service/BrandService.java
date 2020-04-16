package com.changgou.service;

import com.changgou.goods.pojo.Brand;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface BrandService {

    public List<Brand> selectBrand();

    public Brand findByBrand(int id);

    public void insertBrand(Brand brand);

    public void updateBrand(Brand brand);

    public void deleteBrand(int id);

    public List<Brand> searchBrands(Brand brand);

    public PageInfo findPageBrands(int page, int size);

    public PageInfo searchPageBrands(int page, int size, Brand brand);
}
