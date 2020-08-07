package com.handsome.balloonblog.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class TUser implements Serializable {
    @ApiModelProperty(value = "用户id")
    private Long userId;

    @ApiModelProperty(value = "用户的唯一标识")
    private String userOpenId;

    @ApiModelProperty(value = "用户昵称")
    private String userNickname;

    @ApiModelProperty(value = "用户的性别，值为1时是男性，值为2时是女性，值为0时是未知")
    private Byte userSex;

    @ApiModelProperty(value = "用户个人资料填写的省份")
    private String userProvince;

    @ApiModelProperty(value = "国家，如中国为CN")
    private String userCountry;

    @ApiModelProperty(value = "用户头像")
    private String userHeadimgurl;

    @ApiModelProperty(value = "用户邮箱验证状态(1=验证,0=未验证)")
    private Byte userEmailStatus;

    @ApiModelProperty(value = "用户ip")
    private String userLastIp;

    @ApiModelProperty(value = "用户邮箱")
    private String userEmail;

    @ApiModelProperty(value = "用户最近登录")
    private Date userLastLoginTime;

    @ApiModelProperty(value = "用户创建时间")
    private Date userGmtCreate;

    @ApiModelProperty(value = "用户更新时间")
    private Date userGmtModified;

    private static final long serialVersionUID = 1L;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserOpenId() {
        return userOpenId;
    }

    public void setUserOpenId(String userOpenId) {
        this.userOpenId = userOpenId;
    }

    public String getUserNickname() {
        return userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname;
    }

    public Byte getUserSex() {
        return userSex;
    }

    public void setUserSex(Byte userSex) {
        this.userSex = userSex;
    }

    public String getUserProvince() {
        return userProvince;
    }

    public void setUserProvince(String userProvince) {
        this.userProvince = userProvince;
    }

    public String getUserCountry() {
        return userCountry;
    }

    public void setUserCountry(String userCountry) {
        this.userCountry = userCountry;
    }

    public String getUserHeadimgurl() {
        return userHeadimgurl;
    }

    public void setUserHeadimgurl(String userHeadimgurl) {
        this.userHeadimgurl = userHeadimgurl;
    }

    public Byte getUserEmailStatus() {
        return userEmailStatus;
    }

    public void setUserEmailStatus(Byte userEmailStatus) {
        this.userEmailStatus = userEmailStatus;
    }

    public String getUserLastIp() {
        return userLastIp;
    }

    public void setUserLastIp(String userLastIp) {
        this.userLastIp = userLastIp;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public Date getUserLastLoginTime() {
        return userLastLoginTime;
    }

    public void setUserLastLoginTime(Date userLastLoginTime) {
        this.userLastLoginTime = userLastLoginTime;
    }

    public Date getUserGmtCreate() {
        return userGmtCreate;
    }

    public void setUserGmtCreate(Date userGmtCreate) {
        this.userGmtCreate = userGmtCreate;
    }

    public Date getUserGmtModified() {
        return userGmtModified;
    }

    public void setUserGmtModified(Date userGmtModified) {
        this.userGmtModified = userGmtModified;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", userOpenId=").append(userOpenId);
        sb.append(", userNickname=").append(userNickname);
        sb.append(", userSex=").append(userSex);
        sb.append(", userProvince=").append(userProvince);
        sb.append(", userCountry=").append(userCountry);
        sb.append(", userHeadimgurl=").append(userHeadimgurl);
        sb.append(", userEmailStatus=").append(userEmailStatus);
        sb.append(", userLastIp=").append(userLastIp);
        sb.append(", userEmail=").append(userEmail);
        sb.append(", userLastLoginTime=").append(userLastLoginTime);
        sb.append(", userGmtCreate=").append(userGmtCreate);
        sb.append(", userGmtModified=").append(userGmtModified);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}