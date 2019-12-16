package com.zking.P2PLoan.admin.service;

import com.zking.P2PLoan.admin.mapper.IpLogMapper;
import com.zking.P2PLoan.admin.model.IplogModel;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * create by CSQ on 2019-12-16
 */
@Service
public class IpLogServiceImpl implements IpLogService {

    @Resource
    private IpLogMapper ipLogMapper;

    /**
     * 添加用户登录记录的方法
     * @param iplogModel
     * @return
     */
    @Override
    public int addRecordingByLogin(IplogModel iplogModel){
        return ipLogMapper.addRecordingByLogin(iplogModel);
    }

}
