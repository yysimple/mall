package com.jxkj.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jxkj.common.utils.PageUtils;
import com.jxkj.mall.product.entity.BrandEntity;

import java.util.Map;

/**
 * Ʒ
 *
 * @author wcx
 * @email 1449697757@qq.com
 * @date 2020-04-05 23:13:48
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

