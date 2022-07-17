package com.dxl.mall.dao;

import com.dxl.mall.model.PmsProductAttributeValue;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 商品参数/规格属性自定义Dao
 */
public interface PmsProductAttributeValueDao {
    /**
     * 批量创建
     */
    int insertList(@Param("list") List<PmsProductAttributeValue> productAttributeValueList);
}
