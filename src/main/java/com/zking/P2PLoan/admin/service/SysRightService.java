package com.zking.P2PLoan.admin.service;

import com.zking.P2PLoan.admin.model.SysrightModel;

import java.util.List;

/**
 * create by CSQ on 2019-12-18
 */
public interface SysRightService {
    List<SysrightModel> getNodeTree();

    List<SysrightModel> listChild(int id);
}
