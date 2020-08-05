package com.handsome.balloonblog.commons.result;

import io.jsonwebtoken.Claims;
import lombok.Getter;
import lombok.Setter;

/**
 * @program: balloonblog
 * @description: 验证信息
 * @author: handsome
 * @create: 2020-08-06 00:56
 **/
@Getter
@Setter
public class CheckResult {

    private int errCode;

    private boolean success;

    private Claims claims;
}
