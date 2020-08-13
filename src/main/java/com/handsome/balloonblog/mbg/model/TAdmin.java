package com.handsome.balloonblog.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class TAdmin implements Serializable {
    @ApiModelProperty(value = "后台用户id")
    private Long adminId;

    @ApiModelProperty(value = "后台用户账号")
    private String username;

    @ApiModelProperty(value = "后台用户密码")
    private String password;

    @ApiModelProperty(value = "后台用户昵称")
    private String nickname;

    @ApiModelProperty(value = "后台用户上次登录ip")
    private String lastIp;

    @ApiModelProperty(value = "后台用户上次登录时间")
    private Date lastLoginTime;

    @ApiModelProperty(value = "后台用户创建时间")
    private Date adminGmtCreate;

    @ApiModelProperty(value = "后台用户更新时间")
    private Date adminGmtModified;

    private static final long serialVersionUID = 1L;

    public Long getAdminId() {
        return adminId;
    }

    public void setAdminId(Long adminId) {
        this.adminId = adminId;
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

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getLastIp() {
        return lastIp;
    }

    public void setLastIp(String lastIp) {
        this.lastIp = lastIp;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Date getAdminGmtCreate() {
        return adminGmtCreate;
    }

    public void setAdminGmtCreate(Date adminGmtCreate) {
        this.adminGmtCreate = adminGmtCreate;
    }

    public Date getAdminGmtModified() {
        return adminGmtModified;
    }

    public void setAdminGmtModified(Date adminGmtModified) {
        this.adminGmtModified = adminGmtModified;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", adminId=").append(adminId);
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", nickname=").append(nickname);
        sb.append(", lastIp=").append(lastIp);
        sb.append(", lastLoginTime=").append(lastLoginTime);
        sb.append(", adminGmtCreate=").append(adminGmtCreate);
        sb.append(", adminGmtModified=").append(adminGmtModified);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}