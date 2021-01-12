package com.zking.erp.base.shiro;

import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

/**
 *
 * 自定义Realm提供JDBC数据源
 */
public class ShiroRealm extends AuthorizingRealm {

//    @Autowired
//     public ISysUserService sysUserService;
    /**
     * 授权认证
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
//        String username = principalCollection.getPrimaryPrincipal().toString();
//
//        //获取用户角色
//        Set<String> roles = sysUserService.findRoles(username);
//
//        //=获取用户权限
//        Set<String> permissions = sysUserService.findPermissions(username);
//
//        SimpleAuthorizationInfo simpleAuthorizationInfo=new SimpleAuthorizationInfo();
//        simpleAuthorizationInfo.setRoles(roles);
//        simpleAuthorizationInfo.setStringPermissions(permissions);
//
//        return simpleAuthorizationInfo;
        return null;
    }

    /**
     *身份认证
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
//        //获取登录账号密码信息
//        String username=authenticationToken.getPrincipal().toString();
//        String password=authenticationToken.getCredentials().toString();
//
//        SysUser su=new SysUser();
//        su.setUsername(username);
//        SysUser sysUser = sysUserService.userLogin(su);
//        //判断sysUser是否等于null
//        if(sysUser==null)
//            throw  new UnknownAccountException("账号错误");
//
//        SimpleAuthenticationInfo simpleAuthenticationInfo=new SimpleAuthenticationInfo(
//                sysUser.getUsername(),
//                sysUser.getPassword(),
//                ByteSource.Util.bytes(sysUser.getSalt()),
//                this.getName()
//        );
//
//        return simpleAuthenticationInfo;

        return null;
    }
}
