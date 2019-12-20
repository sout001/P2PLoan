package com.zking.P2PLoan.admin.service;

import com.zking.P2PLoan.admin.mapper.IpLogMapper;
import com.zking.P2PLoan.admin.model.IplogModel;
import com.zking.P2PLoan.admin.model.LogininfoModel;
import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
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
     * @param iplogModel
     */
    @Override
    public void addRecordingByLogin(IplogModel iplogModel,LogininfoModel logininfoModel){
        if(logininfoModel !=null && !"".equals(logininfoModel)){
            iplogModel.setUsername(logininfoModel.getUsername());
            iplogModel.setUserType(logininfoModel.getUserType());
            iplogModel.setState(logininfoModel.getState());
            iplogModel.setLogininfoid(logininfoModel.getId());
            iplogModel.setLogintime(new Date());
            String ip = null;
            try {
                ip = InetAddress.getLocalHost().getHostAddress();
            } catch (Exception e) {
                System.out.println(e);
            }
            iplogModel.setIp(ip);
        }
        ipLogMapper.addRecordingByLogin(iplogModel,logininfoModel);
    }

}
