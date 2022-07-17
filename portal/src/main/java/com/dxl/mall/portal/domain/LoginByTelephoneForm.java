package com.dxl.mall.portal.domain;

import javax.validation.constraints.NotBlank;

public class LoginByTelephoneForm {

    @NotBlank
    private String telephone;
    @NotBlank
    private String password;

    public LoginByTelephoneForm(String telephone, String password) {
        this.telephone = telephone;
        this.password = password;
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
}
