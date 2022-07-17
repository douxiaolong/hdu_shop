package com.dxl.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Objects;

/**
 * OSS上传成功后的回调参数
 */

public class OssCallbackParam {
    @ApiModelProperty("请求的回调地址")
    private String callbackUrl;
    @ApiModelProperty("回调是传入request中的参数")
    private String callbackBody;
    @ApiModelProperty("回调时传入参数的格式，比如表单提交形式")
    private String callbackBodyType;

    public OssCallbackParam() {
    }

    public OssCallbackParam(String callbackUrl, String callbackBody, String callbackBodyType) {
        this.callbackUrl = callbackUrl;
        this.callbackBody = callbackBody;
        this.callbackBodyType = callbackBodyType;
    }

    public String getCallbackUrl() {
        return callbackUrl;
    }

    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }

    public String getCallbackBody() {
        return callbackBody;
    }

    public void setCallbackBody(String callbackBody) {
        this.callbackBody = callbackBody;
    }

    public String getCallbackBodyType() {
        return callbackBodyType;
    }

    public void setCallbackBodyType(String callbackBodyType) {
        this.callbackBodyType = callbackBodyType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OssCallbackParam that = (OssCallbackParam) o;
        return Objects.equals(callbackUrl, that.callbackUrl) && Objects.equals(callbackBody, that.callbackBody) && Objects.equals(callbackBodyType, that.callbackBodyType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(callbackUrl, callbackBody, callbackBodyType);
    }
}

