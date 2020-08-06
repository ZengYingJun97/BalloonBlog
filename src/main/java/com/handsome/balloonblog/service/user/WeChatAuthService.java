package com.handsome.balloonblog.service.user;

import com.alibaba.fastjson.JSONObject;
import com.handsome.balloonblog.commons.exception.ResultException;

/**
 * @program: balloonblog
 * @description: 微信第三方登录
 * @author: handsome
 * @create: 2020-08-01 16:20
 **/
public interface WeChatAuthService {

    public abstract JSONObject getUserInfo(String accessToken, String openId) throws ResultException;
}
