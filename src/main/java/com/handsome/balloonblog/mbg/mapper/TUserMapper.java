package com.handsome.balloonblog.mbg.mapper;

import com.handsome.balloonblog.mbg.model.TUser;
import com.handsome.balloonblog.mbg.model.TUserExample;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TUserMapper {
    long countByExample(TUserExample example);

    int deleteByExample(TUserExample example);

    int deleteByPrimaryKey(@Param("userId") Long userId, @Param("userOpenId") String userOpenId);

    int insert(TUser record);

    int insertSelective(TUser record);

    List<TUser> selectByExample(TUserExample example);

    TUser selectByPrimaryKey(@Param("userId") Long userId, @Param("userOpenId") String userOpenId);

    int updateByExampleSelective(@Param("record") TUser record, @Param("example") TUserExample example);

    int updateByExample(@Param("record") TUser record, @Param("example") TUserExample example);

    int updateByPrimaryKeySelective(TUser record);

    int updateByPrimaryKey(TUser record);
}