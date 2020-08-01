package com.handsome.balloonblog.service.impl.user;

import com.alibaba.fastjson.JSONObject;
import com.handsome.balloonblog.service.user.WeChatAuthService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;

/**
 * @program: balloonblog
 * @description: 微信第三方登录实现类
 * @author: handsome
 * @create: 2020-08-01 16:31
 **/
@Service("WeChatAuthService")
public class WeChatAuthServiceImpl extends DefaultAuthServiceImpl implements WeChatAuthService {

    private Logger logger = LoggerFactory.getLogger(WeChatAuthServiceImpl.class);

    @Override
    public String getAccessToken(String code) {
        return super.getAccessToken(code);
    }

    @Override
    public String getOpenId(String accessToken) {
        return super.getOpenId(accessToken);
    }

    @Override
    public String refreshToken(String code) {
        return super.refreshToken(code);
    }

    @Override
    public String getAuthorizationUrl() throws UnsupportedEncodingException {
        return super.getAuthorizationUrl();
    }

    @Override
    public JSONObject getUserInfo(String accessToken, String openId) {
        return super.getUserInfo(accessToken, openId);
    }
}
