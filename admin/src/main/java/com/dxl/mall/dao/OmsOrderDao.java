package com.dxl.mall.dao;

import com.dxl.mall.dto.OmsOrderDeliveryParam;
import com.dxl.mall.dto.OmsOrderDetail;
import com.dxl.mall.dto.OmsOrderQueryParam;
import com.dxl.mall.model.OmsOrder;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface OmsOrderDao {
    /**
     * 条件查询订单
     */
    List<OmsOrder> getList(@Param("queryParam") OmsOrderQueryParam queryParam);

    /**
     * 批量发货
     */
    int delivery(@Param("list") List<OmsOrderDeliveryParam> deliveryParamList);

    /**
     * 获取订单详情
     */
    OmsOrderDetail getDetail(@Param("id") Long id);
}