package com.zking.P2PLoan.admin.service;

import com.zking.P2PLoan.admin.model.IplogModel;
import com.zking.P2PLoan.admin.model.LogininfoModel;
import org.junit.Test;

import javax.annotation.Resource;
import java.net.InetAddress;
import java.util.Date;

/**
 * create by CSQ on 2019-12-16
 */
public class IpLogServiceImplTest extends BaseTest{

    @Resource
    private IpLogServiceImpl ipLogService;

    @Resource
    private LoginServiceImpl loginService;

    @Test
    public void addRecordingByLogin(){
        IplogModel iplogModel = new IplogModel();
        //ipLogService.addRecordingByLogin(iplogModel,"CSQ");
    }
}