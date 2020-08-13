package com.handsome.balloonblog.commons.handler;

import com.alibaba.fastjson.JSONObject;
import com.handsome.balloonblog.commons.result.ErrorCode;
import com.handsome.balloonblog.commons.result.Result;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @program: balloonblog
 * @description: 当访问接口没有权限时，自定义的返回结果
 * @author: handsome
 * @create: 2020-08-13 18:38
 **/
public class RestfulAccessDeniedHandler implements AccessDeniedHandler {

    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException accessDeniedException) throws IOException, ServletException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json");
        response.getWriter().println(JSONObject.toJSON(Result.fail(accessDeniedException.getMessage(), ErrorCode.FORBIDDEN)));
        response.getWriter().flush();
    }
}
