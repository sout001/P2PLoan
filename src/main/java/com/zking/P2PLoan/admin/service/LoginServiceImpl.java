package com.zking.P2PLoan.admin.service;

import com.zking.P2PLoan.admin.mapper.LoginMapper;
import com.zking.P2PLoan.admin.model.IplogModel;
import com.zking.P2PLoan.admin.model.LogininfoModel;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.net.InetAddress;
import java.util.Date;

/**
 * create by CSQ on 2019-12-15
 */
@Service
public class LoginServiceImpl implements LoginService {

    @Resource
    private LoginMapper loginMapper;

    @Resource
    private  IpLogServiceImpl ipLogService;


    /**
     * 通过用户名查找用户信息的方法
     * @param username
     * @return
     */
    @Override
    public LogininfoModel getUserByUserName(String username) {
        LogininfoModel userByUserName = loginMapper.getUserByUserName(username);
        return userByUserName;
    }
}
