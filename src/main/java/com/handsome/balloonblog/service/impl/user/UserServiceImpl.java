package com.handsome.balloonblog.service.impl.user;

import com.handsome.balloonblog.commons.exception.ResultException;
import com.handsome.balloonblog.commons.result.ErrorCode;
import com.handsome.balloonblog.commons.result.Result;
import com.handsome.balloonblog.commons.utils.JwtUtils;
import com.handsome.balloonblog.mbg.mapper.TUserMapper;
import com.handsome.balloonblog.mbg.model.TUser;
import com.handsome.balloonblog.mbg.model.TUserExample;
import com.handsome.balloonblog.service.user.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: balloonblog
 * @description: 用户服务实现类
 * @author: handsome
 * @create: 2020-08-05 22:59
 **/
@Service
public class UserServiceImpl implements UserService {

    private Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private TUserMapper userMapper;


    @Override
    public String login(TUser user) throws Exception {
        TUserExample example = new TUserExample();
        example.createCriteria().andUserOpenIdEqualTo(user.getUserOpenId());
        List<TUser> userList = userMapper.selectByExample(example);
        String token = null;
        if (userList.size() > 0) {
            TUser tUser = userList.get(0);
            token = JwtUtils.createJWT("user", tUser.getUserId().toString(), 1000 * 60 * 60 * 2);
            return token;
        } else {
            try {
                TUser tUser = register(user);
                token = JwtUtils.createJWT("user", tUser.getUserId().toString(), 1000 * 60 * 60 * 2);
                return token;
            } catch (ResultException e) {
                throw e;
            }
        }
    }

    @Override
    @Transactional
    public TUser register(TUser record) throws ResultException {
        try {
            int insertCount = userMapper.insert(record);
            if (insertCount > 0) {
                return record;
            } else {
                return null;
            }
        } catch (Exception e) {
            throw new ResultException(Result.fail("注册异常", ErrorCode.INTERNAL_SERVER_ERROR));
        }
    }
}
