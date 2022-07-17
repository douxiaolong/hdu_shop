package com.dxl.mall.dao;

import com.dxl.mall.model.SmsCouponProductCategoryRelation;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface SmsCouponProductCategoryRelationDao {
    /**
     * 批量创建
     */
    int insertList(@Param("list") List<SmsCouponProductCategoryRelation> productCategoryRelationList);
}
