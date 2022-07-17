package com.dxl.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Objects;

/**
 * 获取OSS上传文件授权返回结果
 */
public class OssPolicyResult {
    @ApiModelProperty("访问身份验证中用到用户标识")
    private String accessKeyId;
    @ApiModelProperty("用户表单上传的策略,经过base64编码过的字符串")
    private String policy;
    @ApiModelProperty("对policy签名后的字符串")
    private String signature;
    @ApiModelProperty("上传文件夹路径前缀")
    private String dir;
    @ApiModelProperty("oss对外服务的访问域名")
    private String host;
    @ApiModelProperty("上传成功后的回调设置")
    private String callback;

    public OssPolicyResult() {
    }

    public OssPolicyResult(String accessKeyId, String policy, String signature, String dir, String host, String callback) {
        this.accessKeyId = accessKeyId;
        this.policy = policy;
        this.signature = signature;
        this.dir = dir;
        this.host = host;
        this.callback = callback;
    }

    public String getAccessKeyId() {
        return accessKeyId;
    }

    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }

    public String getPolicy() {
        return policy;
    }

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getCallback() {
        return callback;
    }

    public void setCallback(String callback) {
        this.callback = callback;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OssPolicyResult that = (OssPolicyResult) o;
        return Objects.equals(accessKeyId, that.accessKeyId) && Objects.equals(policy, that.policy) && Objects.equals(signature, that.signature) && Objects.equals(dir, that.dir) && Objects.equals(host, that.host) && Objects.equals(callback, that.callback);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessKeyId, policy, signature, dir, host, callback);
    }
}

