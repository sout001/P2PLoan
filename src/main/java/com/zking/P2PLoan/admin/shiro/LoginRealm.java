package com.zking.P2PLoan.admin.shiro;

import com.zking.P2PLoan.admin.model.LogininfoModel;
import com.zking.P2PLoan.admin.service.LoginServiceImpl;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.util.ObjectUtils;

import javax.annotation.Resource;

/**
 * create by CSQ on 2019-12-15
 */
public class LoginRealm extends AuthorizingRealm  {

    @Resource
    private LoginServiceImpl loginService;

    /**
     * 授权
     * @param principals
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        return null;
    }


    /**
     * 认证
     * @param token
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        
        //获取当前用户名
        String userName = token.getPrincipal().toString();

        LogininfoModel user = loginService.getUserByUserName(userName);

        if(ObjectUtils.isEmpty(user)){
            throw new UnknownAccountException();
        }
        System.out.println(this.getName());
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
                user.getUsername(),
                user.getPassword(),
                ByteSource.Util.bytes(user.getSalt()),
               this.getName()
        );
        return authenticationInfo;
    }
}
