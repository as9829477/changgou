package com.changgou.controller;

import com.changgou.goods.pojo.Album;
import com.changgou.service.AlbumService;
import com.github.pagehelper.PageInfo;
import entity.BaseExceptionHandler;
import entity.Result;
import entity.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin
@RequestMapping("/album")
public class AlbumController extends BaseExceptionHandler {


    @Autowired
    private AlbumService albumService;

    /**
     * 查询全部数据
     * @return
     */
    @GetMapping
    public Result findAll(){
        List<Album> albumList = albumService.findAll();
        return new Result(true, StatusCode.OK,"查询成功",albumList) ;
    }

    /***
     * 根据ID查询数据
     * @param id
     * @return
     */
    @GetMapping("findById/{id}")
    public Result findById(@PathVariable Long id){
        Album album = albumService.findById(id);
        return new Result(true,StatusCode.OK,"查询成功",album);
    }


    /***
     * 新增数据
     * @param album
     * @return
     */
    @PostMapping(value = "add")
    public Result add(@RequestBody Album album){
        albumService.add(album);
        return new Result(true,StatusCode.OK,"添加成功");
    }


    /***
     * 修改数据
     * @param album
     * @param
     * @return
     */
    @PostMapping(value = "update")
    public Result update(@RequestBody Album album){
        //album.setId(id);
        albumService.update(album);
        return new Result(true,StatusCode.OK,"修改成功");
    }


    /***
     * 根据ID删除品牌数据
     * @param id
     * @return
     */
    @DeleteMapping(value = "delete/{id}" )
    public Result delete(@PathVariable Long id){
        albumService.delete(id);
        return new Result(true,StatusCode.OK,"删除成功");
    }

    /***
     * 多条件搜索品牌数据
     * @param album
     * @return
     */
    @GetMapping(value = "/search" )
    public Result findList(@RequestBody Album album){
        List<Album> list = albumService.findList(album);
        return new Result(true,StatusCode.OK,"查询成功",list);
    }


    /***
     * 分页搜索实现
     * @param album
     * @param page
     * @param size
     * @return
     */
    @GetMapping(value = "/search/{page}/{size}" )
    public Result findPage(@RequestBody Album album, @PathVariable  int page, @PathVariable  int size){
        PageInfo<Album> pageList = albumService.findPage(album, page, size);
//        PageResult pageResult=new PageResult(pageList.getTotal(),pageList.getResult());
        return new Result(true,StatusCode.OK,"查询成功",pageList.getList());
    }


}
