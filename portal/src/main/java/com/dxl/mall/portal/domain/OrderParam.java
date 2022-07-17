package com.dxl.mall.portal.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;
import java.util.Objects;


public class OrderParam {
    @ApiModelProperty("收货地址ID")
    private Long memberReceiveAddressId;
    @ApiModelProperty("优惠券ID")
    private Long couponId;
    @ApiModelProperty("使用的积分数")
    private Integer useIntegration;
    @ApiModelProperty("支付方式")
    private Integer payType;
    @ApiModelProperty("被选中的购物车商品ID")
    private List<Long> cartIds;

    public OrderParam() {
    }

    public OrderParam(Long memberReceiveAddressId, Long couponId, Integer useIntegration, Integer payType, List<Long> cartIds) {
        this.memberReceiveAddressId = memberReceiveAddressId;
        this.couponId = couponId;
        this.useIntegration = useIntegration;
        this.payType = payType;
        this.cartIds = cartIds;
    }

    public Long getMemberReceiveAddressId() {
        return memberReceiveAddressId;
    }

    public void setMemberReceiveAddressId(Long memberReceiveAddressId) {
        this.memberReceiveAddressId = memberReceiveAddressId;
    }

    public Long getCouponId() {
        return couponId;
    }

    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }

    public Integer getUseIntegration() {
        return useIntegration;
    }

    public void setUseIntegration(Integer useIntegration) {
        this.useIntegration = useIntegration;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public List<Long> getCartIds() {
        return cartIds;
    }

    public void setCartIds(List<Long> cartIds) {
        this.cartIds = cartIds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderParam that = (OrderParam) o;
        return Objects.equals(memberReceiveAddressId, that.memberReceiveAddressId) && Objects.equals(couponId, that.couponId) && Objects.equals(useIntegration, that.useIntegration) && Objects.equals(payType, that.payType) && Objects.equals(cartIds, that.cartIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(memberReceiveAddressId, couponId, useIntegration, payType, cartIds);
    }
}
