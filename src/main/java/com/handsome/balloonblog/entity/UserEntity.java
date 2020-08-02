package com.handsome.balloonblog.entity;

import com.handsome.balloonblog.commons.entity.BaseEntity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @program: balloonblog
 * @description:
 * @author: handsome
 * @create: 2020-08-02 22:43
 **/
@Entity
@Table(name = "t_user")
public class UserEntity implements Serializable {

    private static final long serialVersionUID = 3677770734711941587L;

    @Id
    @Column(name = "user_id")
    private Long userId;

    @Basic
    @Column(name = "user_open_id")
    private String userOpenId;

    @Basic
    @Column(name = "user_nickname")
    private String userNickname;

    @Basic
    @Column(name = "user_sex")
    private short userSex;

    @Basic
    @Column(name = "user_province")
    private String userProvince;

    @Basic
    @Column(name = "user_country")
    private String userCountry;

    @Basic
    @Column(name = "user_headimgurl")
    private String userHeadimgurl;

    @Basic
    @Column(name = "user_email")
    private String userEmail;

    @Basic
    @Column(name = "user_email_status")
    private short userEmailStatus;

    @Basic
    @Column(name = "user_last_ip")
    private String userLastIp;

    @Basic
    @Column(name = "user_last_login_time")
    private Long userLastLoginTime;

    @Basic
    @Column(name = "user_gmt_create")
    private Long userGmtCreate;

    @Basic
    @Column(name = "user_gmt_modified")
    private Long userGmtModified;

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

    public short getUserSex() {
        return userSex;
    }

    public void setUserSex(short userSex) {
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

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public short getUserEmailStatus() {
        return userEmailStatus;
    }

    public void setUserEmailStatus(short userEmailStatus) {
        this.userEmailStatus = userEmailStatus;
    }

    public String getUserLastIp() {
        return userLastIp;
    }

    public void setUserLastIp(String userLastIp) {
        this.userLastIp = userLastIp;
    }

    public Long getUserLastLoginTime() {
        return userLastLoginTime;
    }

    public void setUserLastLoginTime(Long userLastLoginTime) {
        this.userLastLoginTime = userLastLoginTime;
    }

    public Long getUserGmtCreate() {
        return userGmtCreate;
    }

    public void setUserGmtCreate(Long userGmtCreate) {
        this.userGmtCreate = userGmtCreate;
    }

    public Long getUserGmtModified() {
        return userGmtModified;
    }

    public void setUserGmtModified(Long userGmtModified) {
        this.userGmtModified = userGmtModified;
    }
}
