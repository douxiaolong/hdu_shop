package com.dxl.mall.dto;

import com.dxl.mall.model.PmsProductAttribute;
import com.dxl.mall.model.PmsProductAttributeCategory;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


public class PmsProductAttributeCategoryItem extends PmsProductAttributeCategory {
    @ApiModelProperty(value = "商品属性列表")
    private List<PmsProductAttribute> productAttributeList;

    public PmsProductAttributeCategoryItem(List<PmsProductAttribute> productAttributeList) {
        this.productAttributeList = productAttributeList;
    }

    public PmsProductAttributeCategoryItem() {
    }

    public List<PmsProductAttribute> getProductAttributeList() {
        return productAttributeList;
    }

    public void setProductAttributeList(List<PmsProductAttribute> productAttributeList) {
        this.productAttributeList = productAttributeList;
    }
}
