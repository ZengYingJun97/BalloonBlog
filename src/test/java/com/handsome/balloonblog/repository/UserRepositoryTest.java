package com.handsome.balloonblog.repository;

import com.handsome.balloonblog.entity.UserEntity;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@ContextConfiguration
class UserRepositoryTest {

    private Logger logger = LoggerFactory.getLogger(UserRepositoryTest.class);

    @Autowired
    private UserRepository userRepository;

    @Test
    void findUserEntityByUserOpenIdIsIn() {
    }

    @Test
    void save() {
        UserEntity entity = new UserEntity();
        entity.setUserOpenId("kaguodhalasdjasnf");
        entity.setUserNickname("handsome");
        entity.setUserEmail("Asfadasdad");
        entity.setUserCountry("Asfagafd");
        entity.setUserEmailStatus((short) 1);
        entity.setUserHeadimgurl("adsafasdsad");
        entity.setUserLastIp("localhost");
        entity.setUserLastLoginTime(new Date().getTime());
        entity.setUserSex((short) 1);
        entity.setUserProvince("agdkahdna");

        logger.debug(entity.toString());

        entity = userRepository.save(entity);

        logger.debug(entity.toString());
    }

    @Test
    void findAll() {
    }
}