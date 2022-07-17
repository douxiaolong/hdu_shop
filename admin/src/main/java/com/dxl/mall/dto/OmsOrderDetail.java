package com.dxl.mall.dto;

import com.dxl.mall.model.OmsOrder;
import com.dxl.mall.model.OmsOrderItem;
import com.dxl.mall.model.OmsOrderOperateHistory;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class OmsOrderDetail extends OmsOrder {
    @Getter
    @Setter
    @ApiModelProperty("订单商品列表")
    private List<OmsOrderItem> orderItemList;
    @Getter
    @Setter
    @ApiModelProperty("订单操作记录列表")
    private List<OmsOrderOperateHistory> historyList;

    public OmsOrderDetail() {
    }

    public OmsOrderDetail(List<OmsOrderItem> orderItemList, List<OmsOrderOperateHistory> historyList) {
        this.orderItemList = orderItemList;
        this.historyList = historyList;
    }

    public List<OmsOrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(List<OmsOrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public List<OmsOrderOperateHistory> getHistoryList() {
        return historyList;
    }

    public void setHistoryList(List<OmsOrderOperateHistory> historyList) {
        this.historyList = historyList;
    }
}
