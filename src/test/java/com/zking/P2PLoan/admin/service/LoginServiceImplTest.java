package com.zking.P2PLoan.admin.service;

import com.zking.P2PLoan.admin.model.LogininfoModel;
import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;
import org.junit.Assert;
import org.junit.Test;

import javax.annotation.Resource;

import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

/**
 * create by CSQ on 2019-12-15
 */
public class LoginServiceImplTest extends BaseTest{

    @Resource
    private LoginServiceImpl loginService;
    
    @Test
    public void getUserByUserName() {
        LogininfoModel user = loginService.getUserByUserName("admin");
        System.out.println(user);
        System.out.println("---------------");
        //1,创建缓存管理器
        CacheManager cm = CacheManager.create(LoginServiceImpl.class.getClassLoader().getResourceAsStream("ehcache.xml"));
        //2,获取指定的缓存
        Cache cache = cm.getCache("user");

        Assert.assertNotNull(user);
    }

    @Test
    public void getRolesByUserName() {
        Set<String> roles = loginService.getRolesByUserName("CSQ");
        for (String r : roles) {
            System.out.println(r);
        }
        Assert.assertEquals(roles.size(),1);
    }

    @Test
    public void getPermissionByUserName() {
        Set<String> permissions = loginService.getPermissionByuserName("admin");
        for (String p : permissions) {
            System.out.println(p);
        }
        Assert.assertEquals(permissions.size(),9);
    }

}