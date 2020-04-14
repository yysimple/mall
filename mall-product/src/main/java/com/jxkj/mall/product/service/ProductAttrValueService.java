package com.jxkj.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jxkj.common.utils.PageUtils;
import com.jxkj.mall.product.entity.ProductAttrValueEntity;

import java.util.Map;

/**
 * spu
 *
 * @author wcx
 * @email 1449697757@qq.com
 * @date 2020-04-05 23:13:47
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

