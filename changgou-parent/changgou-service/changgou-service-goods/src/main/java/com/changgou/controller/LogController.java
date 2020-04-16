package com.changgou.controller;

import com.changgou.goods.pojo.Log;
import com.changgou.service.LogService;
import com.github.pagehelper.PageInfo;
import entity.BaseExceptionHandler;
import entity.Result;
import entity.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin
@RequestMapping("/log")
public class LogController extends BaseExceptionHandler {


    @Autowired
    private LogService logService;

    /**
     * 查询全部数据
     * @return
     */
    @GetMapping(value = "findAll")
    public Result findAll(){
        List<Log> logList = logService.findAll();
        return new Result(true, StatusCode.OK,"查询成功",logList) ;
    }

    /***
     * 根据ID查询数据
     * @param id
     * @return
     */
    @GetMapping("findById/{id}")
    public Result findById(@PathVariable Long id){
        Log log = logService.findById(id);
        return new Result(true,StatusCode.OK,"查询成功",log);
    }


    /***
     * 新增数据
     * @param log
     * @return
     */
    @PostMapping(value = "add")
    public Result add(@RequestBody Log log){
        logService.add(log);
        return new Result(true,StatusCode.OK,"添加成功");
    }


    /***
     * 修改数据
     * @param log
     * @param id
     * @return
     */
    @PutMapping(value="update/{id}")
    public Result update(@RequestBody Log log,@PathVariable Long id){
       // log.setId(id);
        logService.update(log);
        return new Result(true,StatusCode.OK,"修改成功");
    }


    /***
     * 根据ID删除品牌数据
     * @param id
     * @return
     */
    @DeleteMapping(value = "delete/{id}" )
    public Result delete(@PathVariable Long id){
        logService.delete(id);
        return new Result(true,StatusCode.OK,"删除成功");
    }

    /***
     * 多条件搜索品牌数据
     * @param log
     * @return
     */
    @GetMapping(value = "/search" )
    public Result findList(@RequestBody Log log){
        List<Log> list = logService.findList(log);
        return new Result(true,StatusCode.OK,"查询成功",list);
    }


    /***
     * 分页搜索实现
     * @param log
     * @param page
     * @param size
     * @return
     */
    @GetMapping(value = "/search/{page}/{size}" )
    public Result findPage(@RequestBody Log log, @PathVariable  int page, @PathVariable  int size){
        PageInfo<Log> pageList = logService.findPage(log, page, size);
        return new Result(true,StatusCode.OK,"查询成功",pageList.getList());
    }


}
