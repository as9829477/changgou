package com.changgou.controller;

import com.changgou.file.FastDFSFile;
import com.changgou.util.FastDFSUtil;
import entity.BaseExceptionHandler;
import entity.Result;
import entity.StatusCode;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


@RestController
@RequestMapping(value = "/files")
@CrossOrigin
public class FileController extends BaseExceptionHandler {

    @PostMapping(value = "/uploadFile")
    public Result uploadFile(@RequestParam(value = "multipartFile") MultipartFile multipartFile) throws Exception {
        System.out.println("multipartFile---》"+multipartFile.toString());
        FastDFSFile fastDFSFile = new FastDFSFile(multipartFile.getOriginalFilename(), multipartFile.getBytes(), StringUtils.getFilenameExtension(multipartFile.getOriginalFilename()));

        String[] upload = FastDFSUtil.upload(fastDFSFile);
        System.out.println("upload-----》"+upload);

        String path=FastDFSUtil.getTrackerInfo()+"/"+upload[0]+"/"+upload[1];

        return new Result(true, StatusCode.OK,"上传成功",path);
    }

}
