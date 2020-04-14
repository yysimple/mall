package com.jxkj.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jxkj.common.utils.PageUtils;
import com.jxkj.mall.product.entity.SpuInfoDescEntity;

import java.util.Map;

/**
 * spu
 *
 * @author wcx
 * @email 1449697757@qq.com
 * @date 2020-04-05 23:13:47
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

