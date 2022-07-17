package com.dxl.mall.portal.domain;

import javax.validation.constraints.NotBlank;

public class UpdatePasswordForm {
    @NotBlank
    private String telephone;
    @NotBlank
    private String password;
    @NotBlank
    private String authCode;

    public UpdatePasswordForm(String telephone, String password, String authCode) {
        this.telephone = telephone;
        this.password = password;
        this.authCode = authCode;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
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
}
