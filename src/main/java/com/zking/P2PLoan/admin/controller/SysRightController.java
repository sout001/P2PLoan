package com.zking.P2PLoan.admin.controller;

import com.alibaba.fastjson.JSON;
import com.zking.P2PLoan.admin.model.SysrightModel;
import com.zking.P2PLoan.admin.service.SysRightServiceImpl;
import com.zking.P2PLoan.util.DataProtocol;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * create by CSQ on 2019-12-18
 */
@RestController
public class SysRightController {

    @Resource
    private SysRightServiceImpl sysRightService;

    @RequestMapping("/admin/sys")
    public Object getTree(){
        DataProtocol data = new DataProtocol();
        //Map<String,Object> sys = new HashMap<>();
        List<SysrightModel> nodeTree = sysRightService.getNodeTree();
        for (SysrightModel nodes : nodeTree){
            nodes.setChilidren(sysRightService.listChild(nodes.getId()));
        }
        data.setData(nodeTree);
        Object o = JSON.toJSON(data);
        return data;
    }
}
