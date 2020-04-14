package com.jxkj.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jxkj.common.utils.PageUtils;
import com.jxkj.mall.coupon.entity.HomeSubjectEntity;

import java.util.Map;

/**
 * 
 *
 * @author wcx
 * @email 1449697757@qq.com
 * @date 2020-04-05 23:18:22
 */
public interface HomeSubjectService extends IService<HomeSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

