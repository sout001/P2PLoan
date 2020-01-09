package com.zking.P2PLoan.admin.service;

import com.zking.P2PLoan.admin.model.IplogModel;
import com.zking.P2PLoan.admin.model.LogininfoModel;
import com.zking.P2PLoan.util.PageBean;

import java.util.List;

/**
 * create by CSQ on 2019-12-16
 */
public interface IpLogService {
    void addRecordingByLogin(IplogModel IplogModel,LogininfoModel logininfoModel);

    List<IplogModel> getIPList(PageBean pageBean, IplogModel iplogModel);

    void DelByID(int id);
}
