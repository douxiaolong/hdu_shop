package com.dxl.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Objects;

/**
 * 商品分类对应属性信息
 */

public class ProductAttrInfo {
    @ApiModelProperty("商品属性ID")
    private Long attributeId;
    @ApiModelProperty("商品属性分类ID")
    private Long attributeCategoryId;

    public ProductAttrInfo(Long attributeId, Long attributeCategoryId) {
        this.attributeId = attributeId;
        this.attributeCategoryId = attributeCategoryId;
    }
    public ProductAttrInfo() {
    }
    public Long getAttributeId() {
        return attributeId;
    }

    public void setAttributeId(Long attributeId) {
        this.attributeId = attributeId;
    }

    public Long getAttributeCategoryId() {
        return attributeCategoryId;
    }

    public void setAttributeCategoryId(Long attributeCategoryId) {
        this.attributeCategoryId = attributeCategoryId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductAttrInfo that = (ProductAttrInfo) o;
        return Objects.equals(attributeId, that.attributeId) && Objects.equals(attributeCategoryId, that.attributeCategoryId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attributeId, attributeCategoryId);
    }
}