package com.zking.P2PLoan.admin.service;

import com.zking.P2PLoan.admin.model.SystemdictionaryModel;

import java.util.List;
import java.util.Map;

/**
 * create by CSQ on 2019-12-12
 */
public interface SystemDictionaryService {
    List<SystemdictionaryModel> list(Map<String, Object> ParamMap);
}
