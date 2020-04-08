package com.changgou.controller;

import com.changgou.goods.pojo.Brand;
import com.changgou.service.BrandService;
import com.github.pagehelper.PageInfo;
import entity.BaseExceptionHandler;
import entity.Result;
import entity.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/brand")
/**
 * A域名访问B域名的数据
 */
@CrossOrigin //跨域
public class BrandController extends BaseExceptionHandler {

    @Autowired
    private BrandService brandService;


    @GetMapping
    public Result<List<Brand>> selectBrand(){
        List<Brand> brandList = brandService.selectBrand();
        System.out.println(brandList);
        return new Result(true, StatusCode.OK,"查询品牌集合成功",brandList);
    }

    @GetMapping(value = "/{id}")
    public Result<Brand> findByBrand(@PathVariable(value = "id") Integer id){
        Brand brand = brandService.findByBrand(id);
        System.out.println(brand);
        return new Result(true, StatusCode.OK,"根据id查询品牌对象成功",brand);
    }

   @PostMapping
    public Result insertBrand(@RequestBody Brand brand){
       brandService.insertBrand(brand);

        return new Result(true, StatusCode.OK,"添加品牌数据成功");
    }

    @PostMapping("/updateBrand")
    public Result updateBrand(@RequestBody Brand brand){
        brandService.updateBrand(brand);

        return new Result(true, StatusCode.OK,"修改品牌数据成功");
    }

    @GetMapping("/deleteBrand/{id}")
    public Result deleteBrand(@PathVariable(value = "id") int id){
        brandService.deleteBrand(id);

        return new Result(true, StatusCode.OK,"删除品牌数据成功");
    }

    @PostMapping("/searchBrands")
    public Result searchBrands(@RequestBody Brand brand){
        List<Brand> list = brandService.searchBrands(brand);

        return new Result(true, StatusCode.OK,"模糊查询品牌数据成功",list);
    }

    @GetMapping("/findPageBrands/{page}/{size}")
    public Result findPageBrands(@PathVariable(value = "page") int page,
                                 @PathVariable(value = "size")int size){
        PageInfo pageBrands = brandService.findPageBrands(page, size);

        return new Result(true, StatusCode.OK,"分页查询品牌数据成功",pageBrands.getList());
    }

    @PostMapping("/searchPageBrands/{page}/{size}")
    public Result searchPageBrands(@RequestBody Brand brand,@PathVariable(value = "page") int page,
                                   @PathVariable(value = "size")int size){
        PageInfo pageInfo = brandService.searchPageBrands(page, size, brand);
        return new Result(true, StatusCode.OK,"模糊查询品牌数据成功",pageInfo.getList());
    }
}
