package com.changgou.goods.pojo;

import lombok.Data;

@Data
public class Brand {

    private Integer id;//'品牌id',
    private String name;// '品牌名称',
    private String image;// '品牌图片地址',
    private String letter;// '品牌的首字母',
    private Integer seq;//排序
}
