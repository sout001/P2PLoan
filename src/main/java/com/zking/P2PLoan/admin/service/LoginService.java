package com.zking.P2PLoan.admin.service;

import com.zking.P2PLoan.admin.model.LogininfoModel;

/**
 * create by CSQ on 2019-12-15
 */
public interface LoginService {

    /**
     * 通过用户名来获取用户信息
     * @param username 用户名
     * @return LogininfoModel
     */
    LogininfoModel getUserByUserName(String username);
}
