package com.dxl.mall.portal.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * 退货申请请求参数
 */
public class OmsOrderReturnApplyParam {
    @ApiModelProperty("订单id")
    private Long orderId;
    @ApiModelProperty("退货商品id")
    private Long productId;
    @ApiModelProperty("订单编号")
    private String orderSn;
    @ApiModelProperty("会员用户名")
    private String memberUsername;
    @ApiModelProperty("退货人姓名")
    private String returnName;
    @ApiModelProperty("退货人电话")
    private String returnPhone;
    @ApiModelProperty("商品图片")
    private String productPic;
    @ApiModelProperty("商品名称")
    private String productName;
    @ApiModelProperty("商品品牌")
    private String productBrand;
    @ApiModelProperty("商品销售属性：颜色：红色；尺码：xl;")
    private String productAttr;
    @ApiModelProperty("退货数量")
    private Integer productCount;
    @ApiModelProperty("商品单价")
    private BigDecimal productPrice;
    @ApiModelProperty("商品实际支付单价")
    private BigDecimal productRealPrice;
    @ApiModelProperty("原因")
    private String reason;
    @ApiModelProperty("描述")
    private String description;
    @ApiModelProperty("凭证图片，以逗号隔开")
    private String proofPics;

    public OmsOrderReturnApplyParam() {
    }

    public OmsOrderReturnApplyParam(Long orderId, Long productId, String orderSn, String memberUsername, String returnName, String returnPhone, String productPic, String productName, String productBrand, String productAttr, Integer productCount, BigDecimal productPrice, BigDecimal productRealPrice, String reason, String description, String proofPics) {
        this.orderId = orderId;
        this.productId = productId;
        this.orderSn = orderSn;
        this.memberUsername = memberUsername;
        this.returnName = returnName;
        this.returnPhone = returnPhone;
        this.productPic = productPic;
        this.productName = productName;
        this.productBrand = productBrand;
        this.productAttr = productAttr;
        this.productCount = productCount;
        this.productPrice = productPrice;
        this.productRealPrice = productRealPrice;
        this.reason = reason;
        this.description = description;
        this.proofPics = proofPics;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public String getMemberUsername() {
        return memberUsername;
    }

    public void setMemberUsername(String memberUsername) {
        this.memberUsername = memberUsername;
    }

    public String getReturnName() {
        return returnName;
    }

    public void setReturnName(String returnName) {
        this.returnName = returnName;
    }

    public String getReturnPhone() {
        return returnPhone;
    }

    public void setReturnPhone(String returnPhone) {
        this.returnPhone = returnPhone;
    }

    public String getProductPic() {
        return productPic;
    }

    public void setProductPic(String productPic) {
        this.productPic = productPic;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }

    public String getProductAttr() {
        return productAttr;
    }

    public void setProductAttr(String productAttr) {
        this.productAttr = productAttr;
    }

    public Integer getProductCount() {
        return productCount;
    }

    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public BigDecimal getProductRealPrice() {
        return productRealPrice;
    }

    public void setProductRealPrice(BigDecimal productRealPrice) {
        this.productRealPrice = productRealPrice;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProofPics() {
        return proofPics;
    }

    public void setProofPics(String proofPics) {
        this.proofPics = proofPics;
    }


}