package com.handsome.balloonblog.controller;

import com.alibaba.fastjson.JSONObject;
import com.handsome.balloonblog.commons.result.ErrorCode;
import com.handsome.balloonblog.commons.result.Result;
import com.handsome.balloonblog.service.user.AuthService;
import com.handsome.balloonblog.service.user.UserService;
import com.handsome.balloonblog.service.user.WeChatAuthService;
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
@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private AuthService authService;

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
