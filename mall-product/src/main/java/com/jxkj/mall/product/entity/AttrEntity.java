package com.jxkj.mall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author wcx
 * @email 1449697757@qq.com
 * @date 2020-04-05 23:13:48
 */
@Data
@TableName("pms_attr")
public class AttrEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long attrId;
	/**
	 * 
	 */
	private String attrName;
	/**
	 * 
	 */
	private Integer searchType;
	/**
	 * 
	 */
	private String icon;
	/**
	 * 
	 */
	private String valueSelect;
	/**
	 * 
	 */
	private Integer attrType;
	/**
	 * 
	 */
	private Long enable;
	/**
	 * 
	 */
	private Long catelogId;
	/**
	 * 
	 */
	private Integer showDesc;

}
