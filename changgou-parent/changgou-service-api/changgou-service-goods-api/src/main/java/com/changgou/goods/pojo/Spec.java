package com.changgou.goods.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * spec实体类
 * @author 黑马架构师2.5
 *
 */
@Data
public class Spec implements Serializable {

	private Integer id;//ID


	
	private String name;//名称
	private String options;//规格选项
	private Integer seq;//排序
	private Integer templateId;//模板ID

}
