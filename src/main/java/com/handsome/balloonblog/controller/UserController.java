package com.handsome.balloonblog.controller;

import com.alibaba.fastjson.JSONObject;
import com.handsome.balloonblog.commons.result.ErrorCode;
import com.handsome.balloonblog.commons.result.Result;
import com.handsome.balloonblog.service.user.AuthService;
import com.handsome.balloonblog.service.user.UserService;
import com.handsome.balloonblog.service.user.WeChatAuthService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

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
}
