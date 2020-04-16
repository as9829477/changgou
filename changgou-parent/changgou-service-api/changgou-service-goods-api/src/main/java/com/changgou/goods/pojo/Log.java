package com.changgou.goods.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * log实体类
 * @author 黑马架构师2.5
 *
 */
@Data
public class Log implements Serializable {


	private Long id;//id
	private Long branchId;//branch_id
	private String xid;//xid
	private byte[] rollbackInfo;//rollback_info
	private Integer logStatus;//log_status
	private java.util.Date logCreated;//log_created
	private java.util.Date logModified;//log_modified
	private String ext;//ext


}
