package com.zking.P2PLoan.admin.service;

import com.zking.P2PLoan.admin.mapper.IpLogMapper;
import com.zking.P2PLoan.admin.model.IplogModel;
import com.zking.P2PLoan.admin.model.LogininfoModel;
import org.slf4j.Logger;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.net.InetAddress;
import java.util.Date;

/**
 * create by CSQ on 2019-12-16
 */
@Service
public class IpLogServiceImpl implements IpLogService {

    @Resource
    private IpLogMapper ipLogMapper;

    @Resource
    private LoginServiceImpl loginService;

    /**
     * 记录登录的方法
     * @param username
     */
    @Override
    public void addRecordingByLogin(String username){
        LogininfoModel user = loginService.getUserByUserName(username);
        IplogModel iplogModel = new IplogModel();
        iplogModel.setUsername(user.getUsername());
        iplogModel.setLogininfoid(user.getId());
        iplogModel.setState(user.getState());
        iplogModel.setUserType(user.getUserType());
        iplogModel.setLogintime(new Date());
        try {
            String ip = InetAddress.getLocalHost().getHostAddress();
            iplogModel.setIp(ip);
        } catch (Exception e) {
            System.out.println(e);
        }
        ipLogMapper.addRecordingByLogin(username);
    }

}
