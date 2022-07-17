package com.dxl.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotEmpty;
@EqualsAndHashCode(callSuper = false)
public class UmsAdminLoginParam {
    @NotEmpty
    @ApiModelProperty(value = "用户名",required = true)
    private String username;
    @NotEmpty
    @ApiModelProperty(value = "密码",required = true)
    private String password;


    public UmsAdminLoginParam(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public UmsAdminLoginParam() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UmsAdminLoginParam{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
