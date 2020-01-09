package com.zking.P2PLoan.admin.service;

import com.zking.P2PLoan.admin.model.LogininfoModel;
import com.zking.P2PLoan.admin.model.UserinfoModel;
import com.zking.P2PLoan.util.PageBean;

import java.util.List;
import java.util.Map;

/**
 * create by CSQ on 2019-12-22
 */
public interface UserInfoService {
    List<LogininfoModel> getUserList(PageBean pageBean, String UserName, String RealName, Integer UserType);

    void updateUser(int id,int state);

    int addUser(LogininfoModel loginModel);
}
