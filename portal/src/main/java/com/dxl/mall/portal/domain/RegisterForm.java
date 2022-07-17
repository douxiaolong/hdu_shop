package com.dxl.mall.portal.domain;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class RegisterForm {
    @NotBlank
    private String username;
    @NotBlank
    private String password;
    @NotBlank
    private String authCode;
    @NotBlank
    private String telephone;

    public RegisterForm(String username, String password, String authCode, String telephone) {
        this.username = username;
        this.password = password;
        this.authCode = authCode;
        this.telephone = telephone;
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

    public String getAuthCode() {
        return authCode;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
