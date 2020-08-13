package com.handsome.balloonblog.service.impl.admin.user;

import com.handsome.balloonblog.commons.exception.ResultException;
import com.handsome.balloonblog.commons.utils.JwtTokenUtil;
import com.handsome.balloonblog.dao.AdminPermissionRelationDao;
import com.handsome.balloonblog.mbg.mapper.TAdminMapper;
import com.handsome.balloonblog.mbg.model.TAdmin;
import com.handsome.balloonblog.mbg.model.TAdminExample;
import com.handsome.balloonblog.mbg.model.TPermission;
import com.handsome.balloonblog.service.admin.user.AdminService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Date;
import java.util.List;

/**
 * @program: balloonblog
 * @description: 后台用户服务实现类
 * @author: handsome
 * @create: 2020-08-13 22:17
 **/
public class AdminServiceImpl implements AdminService {

    private static final Logger logger = LoggerFactory.getLogger(AdminServiceImpl.class);

    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Value("jwt.tokenHead")
    private String tokenHead;

    @Autowired
    private TAdminMapper tAdminMapper;

    @Autowired
    private AdminPermissionRelationDao adminPermissionRelationDao;


    @Override
    public TAdmin getAdminByUsername(String username) {
        TAdminExample example = new TAdminExample();
        example.createCriteria().andUsernameEqualTo(username);
        List<TAdmin> adminList = tAdminMapper.selectByExample(example);
        if (adminList != null && adminList.size() > 0) {
            return adminList.get(0);
        }
        return null;
    }

    @Override
    public TAdmin register(TAdmin tAdmin) {
        TAdmin result = new TAdmin();
        BeanUtils.copyProperties(tAdmin, result);
        Date now = new Date();
        result.setAdminGmtCreate(now);
        result.setAdminGmtModified(now);
        result.setLastLoginTime(now);

        if (getAdminByUsername(result.getUsername()) != null) {
            return null;
        }

        String encodePassword = passwordEncoder.encode(result.getPassword());
        result.setPassword(encodePassword);
        tAdminMapper.insert(result);
        return result;
    }

    @Override
    public String login(String username, String password) {
        String token = null;
        try {
            UserDetails userDetails = userDetailsService.loadUserByUsername(username);
            if (!passwordEncoder.matches(password, userDetails.getPassword())) {
                throw new RuntimeException("密码不正确");
            }
            UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
            SecurityContextHolder.getContext().setAuthentication(authenticationToken);
            token = jwtTokenUtil.generateToken(userDetails);
        } catch (Exception e) {
            logger.warn("登录异常: {}", e.getMessage());
        }
        return null;
    }

    @Override
    public List<TPermission> getPermissionList(Long adminId) {
        return adminPermissionRelationDao.getPermissionList();
    }
}
