package com.jxkj.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jxkj.common.utils.PageUtils;
import com.jxkj.mall.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku
 *
 * @author wcx
 * @email 1449697757@qq.com
 * @date 2020-04-05 23:13:47
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

