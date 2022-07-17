package com.dxl.mall.dto;

import com.dxl.mall.model.SmsFlashPromotionSession;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;


public class SmsFlashPromotionSessionDetail extends SmsFlashPromotionSession {

    @ApiModelProperty("商品数量")
    private Long productCount;

    public Long getProductCount() {
        return productCount;
    }

    public void setProductCount(Long productCount) {
        this.productCount = productCount;
    }
}
