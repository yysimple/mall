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
@TableName("pms_attr_attrgroup_relation")
public class AttrAttrgroupRelationEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * 
	 */
	private Long attrId;
	/**
	 * 
	 */
	private Long attrGroupId;
	/**
	 * 
	 */
	private Integer attrSort;

}
