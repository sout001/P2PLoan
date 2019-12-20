package com.zking.P2PLoan.admin.service;

import com.zking.P2PLoan.admin.model.IplogModel;
import com.zking.P2PLoan.admin.model.LogininfoModel;

/**
 * create by CSQ on 2019-12-16
 */
public interface IpLogService {
    void addRecordingByLogin(IplogModel IplogModel,LogininfoModel logininfoModel);
}
