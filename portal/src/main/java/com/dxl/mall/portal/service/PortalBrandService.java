package com.dxl.mall.portal.service;

import com.dxl.mall.common.api.CommonPage;
import com.dxl.mall.model.PmsBrand;
import com.dxl.mall.model.PmsProduct;

import java.util.List;

public interface PortalBrandService {
    /**
     * 分页获取推荐品牌
     */
    List<PmsBrand> recommendList(Integer pageNum, Integer pageSize);

    /**
     * 获取品牌详情
     */
    PmsBrand detail(Long brandId);

    /**
     * 分页获取品牌关联商品
     */
    CommonPage<PmsProduct> productList(Long brandId, Integer pageNum, Integer pageSize);
}
