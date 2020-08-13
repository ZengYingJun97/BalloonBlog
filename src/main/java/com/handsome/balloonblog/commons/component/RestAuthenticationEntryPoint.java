package com.handsome.balloonblog.commons.component;

import com.alibaba.fastjson.JSONObject;
import com.handsome.balloonblog.commons.result.ErrorCode;
import com.handsome.balloonblog.commons.result.Result;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @program: balloonblog
 * @description: 当未登录或者token失效访问接口时，自定义的返回结果
 * @author: handsome
 * @create: 2020-08-13 20:59
 **/
public class RestAuthenticationEntryPoint implements AuthenticationEntryPoint {

    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException, ServletException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json");
        response.getWriter().println(JSONObject.toJSON(Result.fail(authException.getMessage(), ErrorCode.FORBIDDEN)));
        response.getWriter().flush();
    }
}
