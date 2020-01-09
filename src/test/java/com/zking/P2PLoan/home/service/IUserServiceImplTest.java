package com.zking.P2PLoan.home.service;

import com.zking.P2PLoan.admin.model.UserinfoModel;
import com.zking.P2PLoan.admin.service.BaseTest;
import org.junit.Test;

import javax.annotation.Resource;

import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

/**
 * create by CSQ on 2020-01-05
 */
public class IUserServiceImplTest extends BaseTest {

    @Resource
    private IUserServiceImpl userService;

    @Test
    public void getUserInfo() {
        UserinfoModel admin = userService.getUserInfo("admin");
        System.out.println(admin);
//        Set<String> strings = admin.keySet();
//        System.out.println(admin.get("idNumber"));
//        for (String str : strings){
//            //admin.get(str);
//            System.out.println(admin.get("username"));
//        }

    }
}