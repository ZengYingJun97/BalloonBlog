package com.handsome.balloonblog.service.impl.user;

import com.handsome.balloonblog.mbg.mapper.TUserMapper;
import com.handsome.balloonblog.mbg.model.TUser;
import com.handsome.balloonblog.mbg.model.TUserExample;
import com.handsome.balloonblog.service.user.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @program: balloonblog
 * @description: 用户服务实现类
 * @author: handsome
 * @create: 2020-08-05 22:59
 **/
public class UserServiceImpl implements UserService {

    private Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private TUserMapper userMapper;


    @Override
    public String login(String userOpenId) {
        TUserExample example = new TUserExample();
        example.createCriteria().andUserOpenIdEqualTo(userOpenId);
        List<TUser> userList = userMapper.selectByExample(example);
        String token = null;
        if (userList.size() > 0) {
        }
        return token;
    }

    @Override
    public TUser register(TUserExample example) {
        return null;
    }
}
