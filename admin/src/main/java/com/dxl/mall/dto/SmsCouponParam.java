package com.dxl.mall.dto;

import com.dxl.mall.model.SmsCoupon;
import com.dxl.mall.model.SmsCouponProductCategoryRelation;
import com.dxl.mall.model.SmsCouponProductRelation;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 优惠券信息封装，包括绑定商品和分类
 */
public class SmsCouponParam extends SmsCoupon {

    @ApiModelProperty("优惠券绑定的商品")
    private List<SmsCouponProductRelation> productRelationList;

    @ApiModelProperty("优惠券绑定的商品分类")
    private List<SmsCouponProductCategoryRelation> productCategoryRelationList;

    public SmsCouponParam(List<SmsCouponProductRelation> productRelationList, List<SmsCouponProductCategoryRelation> productCategoryRelationList) {
        this.productRelationList = productRelationList;
        this.productCategoryRelationList = productCategoryRelationList;
    }

    public SmsCouponParam() {
    }

    public List<SmsCouponProductRelation> getProductRelationList() {
        return productRelationList;
    }

    public void setProductRelationList(List<SmsCouponProductRelation> productRelationList) {
        this.productRelationList = productRelationList;
    }

    public List<SmsCouponProductCategoryRelation> getProductCategoryRelationList() {
        return productCategoryRelationList;
    }

    public void setProductCategoryRelationList(List<SmsCouponProductCategoryRelation> productCategoryRelationList) {
        this.productCategoryRelationList = productCategoryRelationList;
    }
}
