package com.dxl.mall.dto;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class UmsAdminParam {

    @NotBlank
    @ApiModelProperty(value = "用户名", required = true)
    private String username;
    @NotBlank
    @ApiModelProperty(value = "用户名", required = true)
    private String password;

    @ApiModelProperty(value = "用户头像")
    private String icon;

    @Email
    @ApiModelProperty(value = "邮箱")
    private String email;

    @ApiModelProperty(value = "用户昵称")
    private String nickName;

    @ApiModelProperty(value = "备注")
    private String note;

    public UmsAdminParam(String username, String password, String icon, String email, String nickName, String note) {
        this.username = username;
        this.password = password;
        this.icon = icon;
        this.email = email;
        this.nickName = nickName;
        this.note = note;
    }

    public UmsAdminParam() {
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

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
