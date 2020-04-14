package com.jxkj.mall.product.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.jxkj.mall.product.entity.BrandEntity;
import com.jxkj.mall.product.service.BrandService;
import com.jxkj.common.utils.PageUtils;
import com.jxkj.common.utils.R;

import javax.validation.Valid;


/**
 * Ʒ
 *
 * @author wcx
 * @email 1449697757@qq.com
 * @date 2020-04-05 23:13:48
 */
@RestController
@RequestMapping("product/brand")
public class BrandController {
    @Autowired
    private BrandService brandService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("product:brand:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = brandService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{brandId}")
    //@RequiresPermissions("product:brand:info")
    public R info(@PathVariable("brandId") Long brandId){
		BrandEntity brand = brandService.getById(brandId);

        return R.ok().put("brand", brand);
    }

    /**
     * 保存
     */
    @PostMapping("/save")
    //@RequiresPermissions("product:brand:save")
    public R save(@Valid @RequestBody BrandEntity brand/*, BindingResult bindingResult*/){
        /*if (bindingResult.hasErrors()) {
            Map<String, String> map = new HashMap<>(16);
            // 获取校验的错误结果
            bindingResult.getFieldErrors().forEach((item) ->{
                String message = item.getDefaultMessage();
                String field = item.getField();
                map.put(field, message);
            });
            R.error(400, "提交的数据不合法").put("data", map);
        }*/
		brandService.save(brand);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("product:brand:update")
    public R update(@RequestBody BrandEntity brand){
		brandService.updateById(brand);

        return R.ok();
    }

    /**
     * 修改状态
     */
    @PostMapping("/update/status")
    public R updateStatus(@Valid @RequestBody BrandEntity brand, BindingResult bindingResult){
        brandService.updateById(brand);
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("product:brand:delete")
    public R delete(@RequestBody Long[] brandIds){
		brandService.removeByIds(Arrays.asList(brandIds));

        return R.ok();
    }

}
