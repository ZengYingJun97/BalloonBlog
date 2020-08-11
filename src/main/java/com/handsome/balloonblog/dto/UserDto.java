package com.handsome.balloonblog.dto;

import com.handsome.balloonblog.mbg.model.TUser;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @program: balloonblog
 * @description: 用户信息并携带token
 * @author: handsome
 * @create: 2020-08-09 16:11
 **/
@Getter
@Setter
@ToString
public class UserDto {

    @ApiModelProperty(value = "用户信息")
    private TUser user;

    @ApiModelProperty(value = "用户登录token")
    private String token;
}
