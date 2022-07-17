package com.dxl.mall.dto;

import com.dxl.mall.model.OmsCompanyAddress;
import com.dxl.mall.model.OmsOrderReturnApply;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;


public class OmsOrderReturnApplyResult extends OmsOrderReturnApply {
    @ApiModelProperty(value = "公司收货地址")
    private OmsCompanyAddress companyAddress;

    public OmsOrderReturnApplyResult() {
    }

    public OmsOrderReturnApplyResult(OmsCompanyAddress companyAddress) {
        this.companyAddress = companyAddress;
    }

    public OmsCompanyAddress getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(OmsCompanyAddress companyAddress) {
        this.companyAddress = companyAddress;
    }
}

