package com.changgou.controller;

import com.changgou.goods.pojo.Category;
import com.changgou.service.CategoryService;
import com.github.pagehelper.PageInfo;
import entity.BaseExceptionHandler;
import entity.Result;
import entity.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin
@RequestMapping("/category")
public class CategoryController extends BaseExceptionHandler {


    @Autowired
    private CategoryService categoryService;

    /**
     * 查询全部数据
     * @return
     */
    @GetMapping(value = "findAll")
    public Result findAll(){
        List<Category> categoryList = categoryService.findAll();
        return new Result(true, StatusCode.OK,"查询成功",categoryList) ;
    }

    /***
     * 根据ID查询数据
     * @param id
     * @return
     */
    @GetMapping("findById/{id}")
    public Result findById(@PathVariable Integer id){
        Category category = categoryService.findById(id);
        return new Result(true,StatusCode.OK,"查询成功",category);
    }


    /***
     * 新增数据
     * @param category
     * @return
     */
    @PostMapping(value = "add")
    public Result add(@RequestBody Category category){
        categoryService.add(category);
        return new Result(true,StatusCode.OK,"添加成功");
    }


    /***
     * 修改数据
     * @param category
     * @param id
     * @return
     */
    @PutMapping(value="update/{id}")
    public Result update(@RequestBody Category category,@PathVariable Integer id){
       // category.setId(id);
        categoryService.update(category);
        return new Result(true,StatusCode.OK,"修改成功");
    }


    /***
     * 根据ID删除品牌数据
     * @param id
     * @return
     */
    @DeleteMapping(value = "delete/{id}" )
    public Result delete(@PathVariable Integer id){
        categoryService.delete(id);
        return new Result(true,StatusCode.OK,"删除成功");
    }

    /***
     * 多条件搜索品牌数据
     * @param category
     * @return
     */
    @GetMapping(value = "/search" )
    public Result findList(@RequestBody Category category){
        List<Category> list = categoryService.findList(category);
        return new Result(true,StatusCode.OK,"查询成功",list);
    }


    /***
     * 分页搜索实现
     * @param category
     * @param page
     * @param size
     * @return
     */
    @GetMapping(value = "/search/{page}/{size}" )
    public Result findPage(@RequestBody Category category, @PathVariable  int page, @PathVariable  int size){
        PageInfo<Category> pageList = categoryService.findPage(category, page, size);
        return new Result(true,StatusCode.OK,"查询成功",pageList.getList());
    }


}
