package com.handsome.balloonblog.mbg.mapper;

import com.handsome.balloonblog.mbg.model.TAdminRoleRelation;
import com.handsome.balloonblog.mbg.model.TAdminRoleRelationExample;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TAdminRoleRelationMapper {
    long countByExample(TAdminRoleRelationExample example);

    int deleteByExample(TAdminRoleRelationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TAdminRoleRelation record);

    int insertSelective(TAdminRoleRelation record);

    List<TAdminRoleRelation> selectByExample(TAdminRoleRelationExample example);

    TAdminRoleRelation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TAdminRoleRelation record, @Param("example") TAdminRoleRelationExample example);

    int updateByExample(@Param("record") TAdminRoleRelation record, @Param("example") TAdminRoleRelationExample example);

    int updateByPrimaryKeySelective(TAdminRoleRelation record);

    int updateByPrimaryKey(TAdminRoleRelation record);
}