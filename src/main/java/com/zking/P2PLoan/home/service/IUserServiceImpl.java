package com.zking.P2PLoan.home.service;

import com.zking.P2PLoan.admin.model.UserinfoModel;
import com.zking.P2PLoan.home.mapper.IUserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

/**
 * create by CSQ on 2020-01-05
 */
@Service
public class IUserServiceImpl implements IUserService {

    @Resource
    private IUserMapper iUserMapper;

    @Override
    public UserinfoModel getUserInfo(String userName) {
        return iUserMapper.getUserInfo(userName);
    }
}
