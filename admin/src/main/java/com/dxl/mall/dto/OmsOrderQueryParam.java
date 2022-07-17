package com.dxl.mall.dto;

import io.swagger.annotations.ApiModelProperty;

public class OmsOrderQueryParam {
    @ApiModelProperty(value = "订单编号")
    private String orderSn;
    @ApiModelProperty(value = "收货人姓名/号码")
    private String receiverKeyword;
    @ApiModelProperty(value = "订单状态：0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单")
    private Integer status;
    @ApiModelProperty(value = "订单类型：0->正常订单；1->秒杀订单")
    private Integer orderType;
    @ApiModelProperty(value = "订单来源：0->PC订单；1->app订单")
    private Integer sourceType;
    @ApiModelProperty(value = "订单提交时间")
    private String createTime;

    public OmsOrderQueryParam() {
    }

    public OmsOrderQueryParam(String orderSn, String receiverKeyword, Integer status, Integer orderType, Integer sourceType, String createTime) {
        this.orderSn = orderSn;
        this.receiverKeyword = receiverKeyword;
        this.status = status;
        this.orderType = orderType;
        this.sourceType = sourceType;
        this.createTime = createTime;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public String getReceiverKeyword() {
        return receiverKeyword;
    }

    public void setReceiverKeyword(String receiverKeyword) {
        this.receiverKeyword = receiverKeyword;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public Integer getSourceType() {
        return sourceType;
    }

    public void setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}

