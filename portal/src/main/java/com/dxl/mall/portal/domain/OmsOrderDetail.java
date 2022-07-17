package com.dxl.mall.portal.domain;

import com.dxl.mall.model.OmsOrder;
import com.dxl.mall.model.OmsOrderItem;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 包含商品信息的订单详情
 */
public class OmsOrderDetail extends OmsOrder {
    @ApiModelProperty("订单商品列表")
    private List<OmsOrderItem> orderItemList;

    public OmsOrderDetail() {
    }

    public OmsOrderDetail(List<OmsOrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public List<OmsOrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(List<OmsOrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }
}
