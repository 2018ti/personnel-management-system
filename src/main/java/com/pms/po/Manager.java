package com.pms.po;

public class Manager {
    private Integer uId;

    private String uName;

    private String uPassword;

    private String uCategory;

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName == null ? null : uName.trim();
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword == null ? null : uPassword.trim();
    }

    public String getuCategory() {
        return uCategory;
    }

    public void setuCategory(String uCategory) {
        this.uCategory = uCategory == null ? null : uCategory.trim();
    }
}