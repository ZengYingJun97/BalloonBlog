package com.handsome.balloonblog.dto;

import com.handsome.balloonblog.mbg.model.TAdmin;
import com.handsome.balloonblog.mbg.model.TPermission;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @program: balloonblog
 * @description: SpringSecurity的用户详情
 * @author: handsome
 * @create: 2020-08-12 18:48
 **/
public class AdminUserDetails implements UserDetails {

    private TAdmin tAdmin;

    private List<TPermission> permissionList;

    public AdminUserDetails(TAdmin tAdmin, List<TPermission> permissionList) {
        this.tAdmin = tAdmin;
        this.permissionList = permissionList;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return permissionList.stream()
                .filter(permission -> permission.getUri() != null)
                .map(permission -> new SimpleGrantedAuthority(permission.getUri()))
                .collect(Collectors.toList());
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }
}
