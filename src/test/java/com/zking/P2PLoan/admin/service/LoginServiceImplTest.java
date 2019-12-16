package com.zking.P2PLoan.admin.service;

import com.zking.P2PLoan.admin.model.LogininfoModel;
import org.junit.Assert;
import org.junit.Test;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * create by CSQ on 2019-12-15
 */
public class LoginServiceImplTest extends BaseTest{

    @Resource
    private LoginServiceImpl loginService;
    
    @Test
    public void getUserByUserName() {
        LogininfoModel user = loginService.getUserByUserName("CSQ");
        System.out.println(user);
        Assert.assertNotNull(user);
    }
}