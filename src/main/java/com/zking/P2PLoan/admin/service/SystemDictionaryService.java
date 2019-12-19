package com.zking.P2PLoan.admin.service;

import com.zking.P2PLoan.admin.model.SystemdictionaryModel;
import com.zking.P2PLoan.util.PageBean;

import java.util.List;
import java.util.Map;

/**
 * create by CSQ on 2019-12-12
 */
public interface SystemDictionaryService {

    List<SystemdictionaryModel> getSystemdictionary(PageBean pageBean, SystemdictionaryModel systemdictionaryModel);

    int addSystemdictionary(SystemdictionaryModel systemdictionaryModel);

    int delSystemdictionary(int id);

    int updateSystemdictionary(SystemdictionaryModel systemdictionaryModel);
}
