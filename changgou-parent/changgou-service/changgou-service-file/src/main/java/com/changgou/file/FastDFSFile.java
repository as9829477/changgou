package com.changgou.file;

public class FastDFSFile {
    //文件名
    private String name;

    //文件内容
    private byte[] content;

    //文件扩展名 jpg png gif
    private String ext;

    //文件MD5摘要值
    private String md5;

    //文件创建作者
    private String nuthor;

    public FastDFSFile() {
    }

    public FastDFSFile(String name, byte[] content, String ext) {
        this.name = name;
        this.content = content;
        this.ext = ext;
    }

    public FastDFSFile(String name, byte[] content, String ext, String md5, String nuthor) {
        this.name = name;
        this.content = content;
        this.ext = ext;
        this.md5 = md5;
        this.nuthor = nuthor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    public String getNuthor() {
        return nuthor;
    }

    public void setNuthor(String nuthor) {
        this.nuthor = nuthor;
    }
}
