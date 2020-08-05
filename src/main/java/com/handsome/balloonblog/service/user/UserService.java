package com.handsome.balloonblog.service.user;

import com.handsome.balloonblog.mbg.model.TUser;
import com.handsome.balloonblog.mbg.model.TUserExample;
import org.springframework.stereotype.Service;

/**
 * @program: balloonblog
 * @description: 用户服务类
 * @author: handsome
 * @create: 2020-08-05 22:38
 **/
@Service("UserService")
public interface UserService {

    String login(String userOpenId);

    TUser register(TUserExample example);
}
