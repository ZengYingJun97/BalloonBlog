package com.handsome.balloonblog.service.admin.user;

import com.handsome.balloonblog.mbg.model.TAdmin;
import com.handsome.balloonblog.mbg.model.TPermission;

import java.util.List;

/**
 * @program: balloonblog
 * @description: 后台用户服务类
 * @author: handsome
 * @create: 2020-08-13 22:12
 **/
public interface AdminService {

    /**
     * 根据用户名获取后台管理员
     * @param username
     * @return
     */
    TAdmin getAdminByUsername(String username);

    /**
     * 注册功能
     * @param tAdmin
     * @return
     */
    TAdmin register(TAdmin tAdmin);

    /**
     * 登录功能
     * @param username
     * @param password
     * @return
     */
    String login(String username, String password);

    /**
     * 获取用户所有权限
     * @param adminId
     * @return
     */
    List<TPermission> getPermissionList(Long adminId);
}
