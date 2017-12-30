package com.chumo.user.entity;

public class User {
    private Long uId;

    private String username;

    private String password;

    private String mobile;

    private String realName;

    private String handImage;

    public Long getuId() {
        return uId;
    }

    public void setuId(Long uId) {
        this.uId = uId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public String getHandImage() {
        return handImage;
    }

    public void setHandImage(String handImage) {
        this.handImage = handImage == null ? null : handImage.trim();
    }
}