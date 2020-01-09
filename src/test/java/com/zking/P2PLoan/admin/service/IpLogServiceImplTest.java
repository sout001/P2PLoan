package com.zking.P2PLoan.admin.service;

import com.zking.P2PLoan.admin.model.IplogModel;
import com.zking.P2PLoan.admin.model.LogininfoModel;
import com.zking.P2PLoan.util.PageBean;
import org.apache.shiro.SecurityUtils;
import org.junit.Assert;
import org.junit.Test;

import javax.annotation.Resource;
import java.net.InetAddress;
import java.util.Date;
import java.util.List;

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

    @Test
    public void del(){
        ipLogService.DelByID(1);
    }

    @Test
    public void getList(){
        PageBean pageBean = new PageBean();
        pageBean.setRows(7);
        IplogModel ip = new IplogModel();
//        ip.setUsername("CSQ");
        List<IplogModel> ipList = ipLogService.getIPList(pageBean, ip);
        for (IplogModel s : ipList){
            System.out.println(s);
        }

    }

    @Test
    public void test(){
        //SecurityUtils.getSubject().getPrincipal();
        System.out.println(SecurityUtils.getSubject().getPrincipal());
    }

}