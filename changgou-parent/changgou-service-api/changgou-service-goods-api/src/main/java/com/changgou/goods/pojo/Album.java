package com.changgou.goods.pojo;

import lombok.Data;

@Data
public class Album{
    private Long id;//编号
    private String title;//相册名称
    private String image;//相册封面
    private String image_items;//图片列表
}
