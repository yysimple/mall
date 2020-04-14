package com.jxkj.mall.member.feign;

import com.jxkj.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 功能描述：
 *
 * @author wcx
 * @version 1.0
 */
@FeignClient("mall-coupon")
public interface CouponFeignService {

    /**
     * 获取coupon里面的接口
     * @return
     */
    @GetMapping("/coupon/member/list")
    R memberCoupons();
}
