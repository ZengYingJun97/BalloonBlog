package com.handsome.balloonblog.service.user;

import com.alibaba.fastjson.JSONObject;

/**
 * @program: balloonblog
 * @description: 微信第三方登录
 * @author: handsome
 * @create: 2020-08-01 16:20
 **/
public interface WeChatAuthService {

    public JSONObject getUserInfo(String accessToken, String openId);
}
