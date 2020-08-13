package com.handsome.balloonblog.dao;

import com.handsome.balloonblog.mbg.model.TPermission;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @program: balloonblog
 * @description: 自定义用户权限关系管理Dao
 * @author: handsome
 * @create: 2020-08-13 22:26
 **/
public interface AdminPermissionRelationDao {

    List<TPermission> getPermissionList(@Param("adminId") Long adminId);
}
