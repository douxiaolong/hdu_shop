package com.dxl.mall.portal.domain;

import com.dxl.mall.model.PmsProduct;
import com.dxl.mall.model.PmsProductAttribute;
import com.dxl.mall.model.PmsSkuStock;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


public class CartProduct extends PmsProduct {
    @ApiModelProperty("商品属性列表")
    private List<PmsProductAttribute> productAttributeList;
    @ApiModelProperty("商品SKU库存列表")
    private List<PmsSkuStock> skuStockList;

    public List<PmsProductAttribute> getProductAttributeList() {
        return productAttributeList;
    }

    public void setProductAttributeList(List<PmsProductAttribute> productAttributeList) {
        this.productAttributeList = productAttributeList;
    }

    public List<PmsSkuStock> getSkuStockList() {
        return skuStockList;
    }

    public void setSkuStockList(List<PmsSkuStock> skuStockList) {
        this.skuStockList = skuStockList;
    }
}
