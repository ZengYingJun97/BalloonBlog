package com.handsome.balloonblog.repository;

import com.handsome.balloonblog.entity.UserEntity;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @program: balloonblog
 * @description:
 * @author: handsome
 * @create: 2020-08-04 00:03
 **/
public interface UserRepository extends JpaRepository<UserEntity, Long> {

    @Override
    UserEntity save(UserEntity userEntity);

    @Override
    <S extends UserEntity> Page<S> findAll(Example<S> example, Pageable pageable);
}
