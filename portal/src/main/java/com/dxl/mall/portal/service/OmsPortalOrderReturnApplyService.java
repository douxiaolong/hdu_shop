package com.dxl.mall.portal.service;

import com.dxl.mall.portal.domain.OmsOrderReturnApplyParam;

/**
 * 前台订单退货管理Service
 */
public interface OmsPortalOrderReturnApplyService {
    /**
     * 提交申请
     */
    int create(OmsOrderReturnApplyParam returnApply);
}
