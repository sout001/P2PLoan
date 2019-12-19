package com.zking.P2PLoan.admin.service;

import com.github.pagehelper.PageHelper;
import com.zking.P2PLoan.admin.mapper.SystemDictionaryMapper;
import com.zking.P2PLoan.admin.model.SystemdictionaryModel;
import com.zking.P2PLoan.util.PageBean;
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

    @Override
    public List<SystemdictionaryModel> getSystemdictionary(PageBean pageBean,SystemdictionaryModel systemdictionaryModel){
        if(pageBean!=null && pageBean.isPagination()){
            //设置的分页参数最终是保持在线程绑定变量中
            PageHelper.startPage(pageBean.getPage(),pageBean.getRows());
        }
        return systemDictionaryMapper.getSystemdictionary(systemdictionaryModel);
    }

    @Override
    public int addSystemdictionary(SystemdictionaryModel systemdictionaryModel){
        return systemDictionaryMapper.addSystemdictionary(systemdictionaryModel);
    }

    @Override
    public int delSystemdictionary(int id){
        return systemDictionaryMapper.delSystemdictionary(id);
    }

    @Override
    public int updateSystemdictionary(SystemdictionaryModel systemdictionaryModel){
        return systemDictionaryMapper.updatedelSystemdictionary(systemdictionaryModel);
    }
}
