package com.zking.P2PLoan.admin.service;

import com.zking.P2PLoan.admin.mapper.SysrightMapper;
import com.zking.P2PLoan.admin.model.SysrightModel;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * create by CSQ on 2019-12-18
 */
@Service
public class SysRightServiceImpl implements SysRightService {

    @Resource
    private SysrightMapper sysrightMapper;

    @Override
    public List<SysrightModel> getNodeTree(){
        return sysrightMapper.getNodeTree();
    }

    @Override
    public List<SysrightModel> listChild(int id) {
        return sysrightMapper.listChild(id);
    }

}
