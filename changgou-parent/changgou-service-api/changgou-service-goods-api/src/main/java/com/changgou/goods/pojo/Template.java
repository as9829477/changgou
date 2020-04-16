package com.changgou.goods.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * template实体类
 * @author 黑马架构师2.5
 *
 */
@Data
public class Template implements Serializable {

	private Integer id;//ID
	private String name;//模板名称
	private Integer specNum;//规格数量
	private Integer paraNum;//参数数量

}
