package com.handsome.balloonblog.mbg.mapper;

import com.handsome.balloonblog.mbg.model.TRolePermissionRelation;
import com.handsome.balloonblog.mbg.model.TRolePermissionRelationExample;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TRolePermissionRelationMapper {
    long countByExample(TRolePermissionRelationExample example);

    int deleteByExample(TRolePermissionRelationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TRolePermissionRelation record);

    int insertSelective(TRolePermissionRelation record);

    List<TRolePermissionRelation> selectByExample(TRolePermissionRelationExample example);

    TRolePermissionRelation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TRolePermissionRelation record, @Param("example") TRolePermissionRelationExample example);

    int updateByExample(@Param("record") TRolePermissionRelation record, @Param("example") TRolePermissionRelationExample example);

    int updateByPrimaryKeySelective(TRolePermissionRelation record);

    int updateByPrimaryKey(TRolePermissionRelation record);
}