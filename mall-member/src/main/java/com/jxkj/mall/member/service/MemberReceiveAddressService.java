package com.jxkj.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jxkj.common.utils.PageUtils;
import com.jxkj.mall.member.entity.MemberReceiveAddressEntity;

import java.util.Map;

/**
 * 
 *
 * @author wcx
 * @email 1449697757@qq.com
 * @date 2020-04-05 23:22:36
 */
public interface MemberReceiveAddressService extends IService<MemberReceiveAddressEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

