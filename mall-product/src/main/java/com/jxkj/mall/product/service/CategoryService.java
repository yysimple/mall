package com.jxkj.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jxkj.common.utils.PageUtils;
import com.jxkj.mall.product.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 
 *
 * @author wcx
 * @email 1449697757@qq.com
 * @date 2020-04-05 23:13:48
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

    /**
     * 查找所有的代码
     * @return
     */
    List<CategoryEntity> listWithTree();

    /**
     * 功能描述: 通过多个id进行批量删除
     *
     * @Author wcx
     * @param catIds
     * @return void
     **/
    void removeByMenuIds(List<Long> catIds);
}

