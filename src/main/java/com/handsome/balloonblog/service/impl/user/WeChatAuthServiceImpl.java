package com.handsome.balloonblog.service.impl.user;

import com.alibaba.fastjson.JSONObject;
import com.handsome.balloonblog.commons.exception.ResultException;
import com.handsome.balloonblog.commons.result.ErrorCode;
import com.handsome.balloonblog.commons.result.Result;
import com.handsome.balloonblog.service.user.WeChatAuthService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.util.UriComponentsBuilder;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLEncoder;

/**
 * @program: balloonblog
 * @description: 微信第三方登录实现类
 * @author: handsome
 * @create: 2020-08-01 16:31
 **/
@Service
public class WeChatAuthServiceImpl extends DefaultAuthServiceImpl implements WeChatAuthService {

    private Logger logger = LoggerFactory.getLogger(WeChatAuthServiceImpl.class);

    private static final String AUTHORIZATION_URL =
            "https://open.weixin.qq.com/connect/oauth2/authorize?appid=%s&redirect_uri=%s&response_type=code&scope=%s&state=%s#wechat_redirec";

    private static final String ACCESSTOKE_OPENID_URL =
            "https://api.weixin.qq.com/sns/oauth2/access_token?appid=%s&secret=%s&code=%s&grant_type=authorization_code";

    private static final String REFRESH_TOKEN_URL =
            "https://api.weixin.qq.com/sns/oauth2/refresh_token?appid=%s&grant_type=refresh_token&refresh_token=%s";

    private static final String USER_INFO_URL =
            "https://api.weixin.qq.com/sns/userinfo?access_token=%s&openid=%s&lang=zh_CN";

    @Value("${oauth.wx.appid}")
    private String APP_ID;

    @Value("${oauth.wx.appsecret}")
    private String APP_SECRET;

    private static final String SCOPE = "snsapi_userinfo";

    @Value("${oauth.callback.http}")
    private String callbackUrl;

    @Override
    public String getAccessToken(String code) throws ResultException {
        String url = String.format(ACCESSTOKE_OPENID_URL, APP_ID, APP_SECRET, code);

        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(url);
        URI uri = builder.build().encode().toUri();

        String resp = getRestTemplate().getForObject(uri, String.class);
        logger.error("getAccessToken resp = " + resp);
        if (resp.contains("openid")) {
            JSONObject jsonObject = JSONObject.parseObject(resp);
            String access_token = jsonObject.getString("access_token");
            String openId = jsonObject.getString("openid");
            String refresh_token = jsonObject.getString("refresh_token");

            JSONObject res = new JSONObject();
            res.put("access_token", access_token);
            res.put("openId", openId);
            res.put("refresh_token", refresh_token);

            return res.toJSONString();
        } else {
            throw new ResultException(Result.fail("获取token失败, msg = " + resp, ErrorCode.BAD_REQUEST));
        }
    }

    @Override
    public String getOpenId(String accessToken) {
        return super.getOpenId(accessToken);
    }

    @Override
    public String refreshToken(String code) {
        String url = String.format(REFRESH_TOKEN_URL, APP_ID, code);

        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(url);
        URI uri = builder.build().encode().toUri();

        ResponseEntity<JSONObject> resp = getRestTemplate().getForEntity(uri, JSONObject.class);
        JSONObject jsonObject = resp.getBody();

        String accessToken = jsonObject.getString("access_token");
        return accessToken;
    }

    @Override
    public String getAuthorizationUrl() throws UnsupportedEncodingException {
        callbackUrl = URLEncoder.encode(callbackUrl, "utf-8");
        String url = String.format(AUTHORIZATION_URL, APP_ID, callbackUrl, SCOPE, "STATE");
        return url;
    }

    @Override
    public JSONObject getUserInfo(String accessToken, String openId) throws ResultException {
        String url = String.format(USER_INFO_URL, accessToken, openId);

        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(url);
        URI uri = builder.build().encode().toUri();

        String resp = getRestTemplate().getForObject(uri, String.class);
        logger.error("getUserInfo resp = " + resp);
        if (resp.contains("errcode")) {
            throw new ResultException(Result.fail("获取用户信息失败, msg = " + resp, ErrorCode.BAD_REQUEST));
        } else {
            JSONObject data = JSONObject.parseObject(resp);

            logger.info("date = {}", data);

            return data;
        }
    }
}
