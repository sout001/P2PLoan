package com.zking.P2PLoan.admin.service;

import com.zking.P2PLoan.admin.model.IplogModel;
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

    @Test
    public void addRecordingByLogin() throws Exception{
        byte a = 1;
        InetAddress localHost = InetAddress.getLocalHost();
        IplogModel iplogModel = new IplogModel();
        iplogModel.setLogintime(new Date());
        iplogModel.setIp(localHost.getHostAddress());
        iplogModel.setLogininfoid(9);
        iplogModel.setUsername("CSQ");
        iplogModel.setUserType(a);
        iplogModel.setState(a);
        int n = ipLogService.addRecordingByLogin(iplogModel);
        System.out.println(n);
    }
}