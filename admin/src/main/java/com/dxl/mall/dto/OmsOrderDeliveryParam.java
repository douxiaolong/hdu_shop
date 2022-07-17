package com.dxl.mall.dto;

import io.swagger.annotations.ApiModelProperty;

public class OmsOrderDeliveryParam {
    @ApiModelProperty("订单id")
    private Long orderId;
    @ApiModelProperty("物流公司")
    private String deliveryCompany;
    @ApiModelProperty("物流单号")
    private String deliverySn;

    public OmsOrderDeliveryParam() {
    }

    public OmsOrderDeliveryParam(Long orderId, String deliveryCompany, String deliverySn) {
        this.orderId = orderId;
        this.deliveryCompany = deliveryCompany;
        this.deliverySn = deliverySn;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getDeliveryCompany() {
        return deliveryCompany;
    }

    public void setDeliveryCompany(String deliveryCompany) {
        this.deliveryCompany = deliveryCompany;
    }

    public String getDeliverySn() {
        return deliverySn;
    }

    public void setDeliverySn(String deliverySn) {
        this.deliverySn = deliverySn;
    }
}

