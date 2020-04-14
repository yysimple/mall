package com.jxkj.mall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * Ʒ
 * 
 * @author wcx
 * @email 1449697757@qq.com
 * @date 2020-04-05 23:13:48
 */
@Data
@TableName("pms_brand")
public class BrandEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 品牌id
	 */
	@TableId
	private Long brandId;
	/**
	 * 品牌名
	 */
	@NotBlank(message = "品牌名必须提交")
	private String name;
	/**
	 *
	 */
	@NotBlank
	private String logo;
	/**
	 * 
	 */
	@NotBlank
	private String descript;
	/**
	 * 
	 */
	@NotNull
	private Integer showStatus;
	/**
	 * 
	 */
	@NotBlank
	private String firstLetter;
	/**
	 * 
	 */
	@NotNull
	private Integer sort;

}
