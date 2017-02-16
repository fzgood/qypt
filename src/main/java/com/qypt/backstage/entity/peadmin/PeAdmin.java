package com.qypt.backstage.entity.peadmin;

public class PeAdmin {
    private Integer adminId;

    private String adminName;

    private String adminPass;

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName == null ? null : adminName.trim();
    }

    public String getAdminPass() {
        return adminPass;
    }

    public void setAdminPass(String adminPass) {
        this.adminPass = adminPass == null ? null : adminPass.trim();
    }
}