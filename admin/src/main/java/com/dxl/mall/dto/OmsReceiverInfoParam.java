package com.dxl.mall.dto;

import io.swagger.annotations.ApiModelProperty;

public class OmsReceiverInfoParam {
    @ApiModelProperty(value = "订单ID")
    private Long orderId;
    @ApiModelProperty(value = "收货人姓名")
    private String receiverName;
    @ApiModelProperty(value = "收货人电话")
    private String receiverPhone;
    @ApiModelProperty(value = "收货人邮编")
    private String receiverPostCode;
    @ApiModelProperty(value = "详细地址")
    private String receiverDetailAddress;
    @ApiModelProperty(value = "省份/直辖市")
    private String receiverProvince;
    @ApiModelProperty(value = "城市")
    private String receiverCity;
    @ApiModelProperty(value = "区")
    private String receiverRegion;
    @ApiModelProperty(value = "订单状态：0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单")
    private Integer status;

    public OmsReceiverInfoParam() {
    }

    public OmsReceiverInfoParam(Long orderId, String receiverName, String receiverPhone, String receiverPostCode, String receiverDetailAddress, String receiverProvince, String receiverCity, String receiverRegion, Integer status) {
        this.orderId = orderId;
        this.receiverName = receiverName;
        this.receiverPhone = receiverPhone;
        this.receiverPostCode = receiverPostCode;
        this.receiverDetailAddress = receiverDetailAddress;
        this.receiverProvince = receiverProvince;
        this.receiverCity = receiverCity;
        this.receiverRegion = receiverRegion;
        this.status = status;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getReceiverPhone() {
        return receiverPhone;
    }

    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }

    public String getReceiverPostCode() {
        return receiverPostCode;
    }

    public void setReceiverPostCode(String receiverPostCode) {
        this.receiverPostCode = receiverPostCode;
    }

    public String getReceiverDetailAddress() {
        return receiverDetailAddress;
    }

    public void setReceiverDetailAddress(String receiverDetailAddress) {
        this.receiverDetailAddress = receiverDetailAddress;
    }

    public String getReceiverProvince() {
        return receiverProvince;
    }

    public void setReceiverProvince(String receiverProvince) {
        this.receiverProvince = receiverProvince;
    }

    public String getReceiverCity() {
        return receiverCity;
    }

    public void setReceiverCity(String receiverCity) {
        this.receiverCity = receiverCity;
    }

    public String getReceiverRegion() {
        return receiverRegion;
    }

    public void setReceiverRegion(String receiverRegion) {
        this.receiverRegion = receiverRegion;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}

