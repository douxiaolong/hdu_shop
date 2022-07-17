package com.dxl.mall.portal.domain;

import com.dxl.mall.model.PmsProduct;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * 秒杀信息和商品对象封装
 */
public class FlashPromotionProduct extends PmsProduct {
    @ApiModelProperty("秒杀价格")
    private BigDecimal flashPromotionPrice;
    @ApiModelProperty("用于秒杀到数量")
    private Integer flashPromotionCount;
    @ApiModelProperty("秒杀限购数量")
    private Integer flashPromotionLimit;

    public FlashPromotionProduct() {
    }

    public FlashPromotionProduct(BigDecimal flashPromotionPrice, Integer flashPromotionCount, Integer flashPromotionLimit) {
        this.flashPromotionPrice = flashPromotionPrice;
        this.flashPromotionCount = flashPromotionCount;
        this.flashPromotionLimit = flashPromotionLimit;
    }

    public BigDecimal getFlashPromotionPrice() {
        return flashPromotionPrice;
    }

    public void setFlashPromotionPrice(BigDecimal flashPromotionPrice) {
        this.flashPromotionPrice = flashPromotionPrice;
    }

    public Integer getFlashPromotionCount() {
        return flashPromotionCount;
    }

    public void setFlashPromotionCount(Integer flashPromotionCount) {
        this.flashPromotionCount = flashPromotionCount;
    }

    public Integer getFlashPromotionLimit() {
        return flashPromotionLimit;
    }

    public void setFlashPromotionLimit(Integer flashPromotionLimit) {
        this.flashPromotionLimit = flashPromotionLimit;
    }
}

