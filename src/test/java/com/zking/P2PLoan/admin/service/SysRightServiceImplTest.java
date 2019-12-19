package com.zking.P2PLoan.admin.service;

import com.zking.P2PLoan.admin.model.SysrightModel;
import org.junit.Test;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

/**
 * create by CSQ on 2019-12-18
 */
public class SysRightServiceImplTest extends BaseTest{

    @Resource
    private SysRightServiceImpl sysRightService;

    @Test
    public void getNodeTree() {
        List<SysrightModel> nodeTree = sysRightService.getNodeTree();
        for (SysrightModel s : nodeTree){
            System.out.println(s);
        }
//        List<SysrightModel> sy = sysRightService.listChild(2);
//        for (SysrightModel sr : sy){
//            System.out.println(sr);
//        }
    }

    @Test
    public void listChild() {
//        List<SysrightModel> nodeTree = sysRightService.getNodeTree();
//        for (SysrightModel s : nodeTree){
//            List<SysrightModel> sy = sysRightService.listChild(s.getId());
//            for (SysrightModel sr : sy){
//                System.out.println(sr);
//            }
//        }
        List<SysrightModel> sy = sysRightService.listChild(2);
        for (SysrightModel sr : sy){
            System.out.println(sr.getId());
            SysrightModel sysrightModel = new SysrightModel();
            sysrightModel.setChilidren(sy);
            List<SysrightModel> sysrightModels = sysRightService.listChild(sr.getId());
            for (SysrightModel s : sysrightModels){
                System.out.println(s);
                sysrightModel.setChilidren(sysrightModels);
            }
        }
    }
}