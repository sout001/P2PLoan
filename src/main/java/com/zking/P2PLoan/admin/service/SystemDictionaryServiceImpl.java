package com.zking.P2PLoan.admin.service;

import com.zking.P2PLoan.admin.mapper.SystemDictionaryMapper;
import com.zking.P2PLoan.admin.model.SystemdictionaryModel;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * create by CSQ on 2019-12-12
 */
@Service
public class SystemDictionaryServiceImpl implements SystemDictionaryService {
    @Resource
    private SystemDictionaryMapper systemDictionaryMapper;

    /**
     * 获取数据字典数据的方法
     * @param ParamMap
     * @return 返回得到的list集合
     */
    @Override
    public List<SystemdictionaryModel> list(Map<String,Object> ParamMap){
        return systemDictionaryMapper.list(ParamMap);
    }
}
