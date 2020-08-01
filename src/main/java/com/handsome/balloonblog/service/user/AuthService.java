package com.handsome.balloonblog.service.user;

import com.alibaba.fastjson.JSONObject;

import java.io.UnsupportedEncodingException;

/**
 * @program: balloonblog
 * @description: 用户第三方登录
 * @author: handsome
 * @create: 2020-07-31 01:15
 **/
public interface AuthService {

    public abstract String getAccessToken(String code);

    public abstract String getOpenId(String accessToken);

    public abstract String refreshToken(String code);

    public abstract String getAuthorizationUrl() throws UnsupportedEncodingException;

    public abstract JSONObject getUserInfo(String accessToken, String openId);
}
