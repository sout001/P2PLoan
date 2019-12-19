package com.zking.P2PLoan.admin.controller;

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

    @RequestMapping("admin/sys")
    public Object getTree(){
        DataProtocol data = new DataProtocol();
        List<SysrightModel> nodeTree = sysRightService.getNodeTree();
        for (SysrightModel nodes : nodeTree){
            List<SysrightModel> sysrightModels = sysRightService.listChild(nodes.getId());
            for (SysrightModel datas : sysrightModels){
                data.setMessage("操作成功");
                data.setCode(200);
                data.setData(datas);
            }

        }
        return data;
    }
}
