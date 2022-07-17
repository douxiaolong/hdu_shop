package com.dxl.mall.dto;

import com.dxl.mall.model.PmsProduct;
import com.dxl.mall.model.SmsFlashPromotionProductRelation;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;


public class SmsFlashPromotionProduct extends SmsFlashPromotionProductRelation {

    @ApiModelProperty("关联商品")
    private PmsProduct product;

    public SmsFlashPromotionProduct(PmsProduct product) {
        this.product = product;
    }

    public SmsFlashPromotionProduct() {
    }

    public PmsProduct getProduct() {
        return product;
    }

    public void setProduct(PmsProduct product) {
        this.product = product;
    }
}
