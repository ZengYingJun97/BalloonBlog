package com.handsome.balloonblog.controller.user;

import com.alibaba.fastjson.JSONObject;
import com.handsome.balloonblog.commons.constant.RedisPreName;
import com.handsome.balloonblog.commons.exception.ResultException;
import com.handsome.balloonblog.commons.result.ErrorCode;
import com.handsome.balloonblog.commons.result.Result;
import com.handsome.balloonblog.commons.utils.HttpUtils;
import com.handsome.balloonblog.dto.UserDto;
import com.handsome.balloonblog.mbg.model.TUser;
import com.handsome.balloonblog.service.RedisService;
import com.handsome.balloonblog.service.user.AuthService;
import com.handsome.balloonblog.service.user.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * @program: balloonblog
 * @description: 用户管理接口
 * @author: handsome
 * @create: 2020-08-06 18:59
 **/
@Api(tags = "用户管理接口")
@RestController
@RequestMapping("/api/user")
public class UserController {

    private Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @Autowired
    private AuthService authService;

    @Autowired
    private RedisService redisService;

    @ApiOperation("获取微信授权登录链接")
    @RequestMapping(value = "/login/wechat/auth",
            method = RequestMethod.GET)
    @ResponseBody
    public Result getWeChatAuthorizationUrl() {
        try {
            String authorizationUrl = authService.getAuthorizationUrl();
            JSONObject resp = new JSONObject();
            resp.put("authorizationUrl", authorizationUrl);
            return Result.success(resp);
        } catch (Exception e) {
            return Result.fail("后台异常", ErrorCode.INTERNAL_SERVER_ERROR);
        }
    }

    @ApiOperation("微信授权登录回调")
    @RequestMapping(value = "/login/wechat/callback",
            method = RequestMethod.GET)
    @ResponseBody
    public Result getUserInfo(String code, HttpServletRequest request) {
        try {
            String accessToken = authService.getAccessToken(code);

            JSONObject jsonObject = JSONObject.parseObject(accessToken);
            JSONObject userInfo = authService.getUserInfo(jsonObject.getString("access_token"), jsonObject.getString("openId"));

            TUser user = new TUser();
            user.setUserOpenId(userInfo.getString("openid"));
            user.setUserNickname(userInfo.getString("nickname"));
            user.setUserSex(Byte.parseByte(userInfo.getString("sex")));
            user.setUserProvince(userInfo.getString("province"));
            user.setUserCountry(userInfo.getString("country"));
            user.setUserHeadimgurl(userInfo.getString("headimgurl"));
            user.setUserLastIp(HttpUtils.getIPAddress(request));
            user.setUserLastLoginTime(new Date(System.currentTimeMillis()));

            String token = userService.login(user);
            redisService.set(RedisPreName.USER_TOKEM + user.getUserId(), token, 60 * 60 * 24);
            UserDto userDto = new UserDto();
            userDto.setUser(user);
            userDto.setToken(token);
            return  Result.success(userDto);
        } catch (ResultException e) {
            e.printStackTrace();
            return e.getResult();
        } catch (Exception e) {
            e.printStackTrace();
            return Result.fail("后台异常", ErrorCode.INTERNAL_SERVER_ERROR);
        }
    }
}
