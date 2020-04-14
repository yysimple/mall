package com.jxkj.mall.coupon.entity;

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
 * @date 2020-04-05 23:18:22
 */
@Data
@TableName("sms_home_subject")
public class HomeSubjectEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * ר
	 */
	private String name;
	/**
	 * ר
	 */
	private String title;
	/**
	 * ר
	 */
	private String subTitle;
	/**
	 * 
	 */
	private Integer status;
	/**
	 * 
	 */
	private String url;
	/**
	 * 
	 */
	private Integer sort;
	/**
	 * ר
	 */
	private String img;

}
