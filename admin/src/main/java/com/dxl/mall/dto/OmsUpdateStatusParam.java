package com.dxl.mall.dto;

import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;

public class OmsUpdateStatusParam {
    @ApiModelProperty("服务单号")
    private Long id;
    @ApiModelProperty("收货地址关联id")
    private Long companyAddressId;
    @ApiModelProperty("确认退款金额")
    private BigDecimal returnAmount;
    @ApiModelProperty("处理备注")
    private String handleNote;
    @ApiModelProperty("处理人")
    private String handleMan;
    @ApiModelProperty("收货备注")
    private String receiveNote;
    @ApiModelProperty("收货人")
    private String receiveMan;
    @ApiModelProperty("申请状态：1->退货中；2->已完成；3->已拒绝")
    private Integer status;

    public OmsUpdateStatusParam() {
    }

    public OmsUpdateStatusParam(Long id, Long companyAddressId, BigDecimal returnAmount, String handleNote, String handleMan, String receiveNote, String receiveMan, Integer status) {
        this.id = id;
        this.companyAddressId = companyAddressId;
        this.returnAmount = returnAmount;
        this.handleNote = handleNote;
        this.handleMan = handleMan;
        this.receiveNote = receiveNote;
        this.receiveMan = receiveMan;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCompanyAddressId() {
        return companyAddressId;
    }

    public void setCompanyAddressId(Long companyAddressId) {
        this.companyAddressId = companyAddressId;
    }

    public BigDecimal getReturnAmount() {
        return returnAmount;
    }

    public void setReturnAmount(BigDecimal returnAmount) {
        this.returnAmount = returnAmount;
    }

    public String getHandleNote() {
        return handleNote;
    }

    public void setHandleNote(String handleNote) {
        this.handleNote = handleNote;
    }

    public String getHandleMan() {
        return handleMan;
    }

    public void setHandleMan(String handleMan) {
        this.handleMan = handleMan;
    }

    public String getReceiveNote() {
        return receiveNote;
    }

    public void setReceiveNote(String receiveNote) {
        this.receiveNote = receiveNote;
    }

    public String getReceiveMan() {
        return receiveMan;
    }

    public void setReceiveMan(String receiveMan) {
        this.receiveMan = receiveMan;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
