package com.jxkj.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jxkj.common.utils.PageUtils;
import com.jxkj.mall.order.entity.OrderOperateHistoryEntity;

import java.util.Map;

/**
 * 
 *
 * @author wcx
 * @email 1449697757@qq.com
 * @date 2020-04-05 23:35:19
 */
public interface OrderOperateHistoryService extends IService<OrderOperateHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

