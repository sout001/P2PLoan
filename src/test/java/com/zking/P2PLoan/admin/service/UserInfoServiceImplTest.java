package com.zking.P2PLoan.admin.service;

import com.zking.P2PLoan.admin.mapper.UserInfoMapper;
import com.zking.P2PLoan.admin.model.LogininfoModel;
import com.zking.P2PLoan.admin.model.UserinfoModel;
import com.zking.P2PLoan.util.PageBean;
import org.junit.Assert;
import org.junit.Test;

import javax.annotation.Resource;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * create by CSQ on 2019-12-22
 */
public class UserInfoServiceImplTest extends BaseTest {

    @Resource
    private UserInfoServiceImpl userInfoService;

    @Test
    public void getUserList() {
        PageBean pageBean = new PageBean();
        pageBean.setRows(7);
        List<LogininfoModel> userList = userInfoService.getUserList(pageBean, "","",1);
        for (LogininfoModel s : userList){
            System.out.println(s);
            Assert.assertEquals(userList.size(),1);
        }
    }

    @Test
    public void updateUser(){
        LogininfoModel login = new LogininfoModel();
//        byte a = 0;
//        login.setId(3);
//        login.setState(a);
//        int i = userInfoService.updateUser(login);
//        System.out.println(i);
    }

    @Test
    public void addUser(){
        LogininfoModel login = new LogininfoModel();
        login.setUsername("WJX");
        login.setPassword("123456");
        int i = userInfoService.addUser(login);
        System.out.println(i);
    }

}