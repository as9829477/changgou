package com.changgou.dao;

import com.changgou.goods.pojo.Brand;

import java.util.List;

public interface BrandMapper {

    public List<Brand> selectBrand();

    public Brand findByBrand(int id);

    public void insertBrand(Brand brand);

    public void updateBrand(Brand brand);

    public void deleteBrand(int id);

    public List<Brand> searchBrands(Brand brand);


}

