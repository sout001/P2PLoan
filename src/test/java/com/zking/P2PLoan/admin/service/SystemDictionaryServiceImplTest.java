package com.zking.P2PLoan.admin.service;

import com.zking.P2PLoan.admin.model.SystemdictionaryModel;
import com.zking.P2PLoan.admin.model.SystemdictionaryitemModel;
import com.zking.P2PLoan.util.PageBean;
import org.junit.Assert;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * create by CSQ on 2019-12-12
 */
public class SystemDictionaryServiceImplTest extends BaseTest{

    @Resource
    private SystemDictionaryService dictionaryService;

   // @Test
//    public void list() {
//        Map<String,Object> ParamMap = new HashMap<>();
//        ParamMap.put("title","月收入");
//        List<SystemdictionaryModel> list = dictionaryService.list(ParamMap);
//        for (SystemdictionaryModel s : list){
//            System.out.println(s);
//            System.out.println("------------------");
//            for (SystemdictionaryitemModel i : s.getItems()){
//                System.out.println(i);
//            }
//        }
//    }

    @Test
    public void getSystemdictionary() {
        PageBean pageBean = new PageBean();
        pageBean.setRows(7);
        SystemdictionaryModel systemdictionaryModel = new SystemdictionaryModel();
        systemdictionaryModel.setTitle("情");
        systemdictionaryModel.setStatus(0);
        List<SystemdictionaryModel> systemdictionary = dictionaryService.getSystemdictionary(pageBean,systemdictionaryModel);
        for (SystemdictionaryModel s : systemdictionary){
            System.out.println(s);
        }
        Assert.assertEquals(systemdictionary.size(),7);
    }

    @Test
    public void addSystemdictionary(){
        SystemdictionaryModel systemdictionaryModel = new SystemdictionaryModel();
        systemdictionaryModel.setSn("Test02");
        systemdictionaryModel.setTitle("测试2");
        systemdictionaryModel.setIntro("test02");
        int i = dictionaryService.addSystemdictionary(systemdictionaryModel);
        System.out.println(i);
    }
    @Test
    public void delSystemdictionary(){
        int i = dictionaryService.delSystemdictionary(8);
        System.out.println(8);

    }

    @Test
    public void updateSystemdictionary(){
        SystemdictionaryModel systemdictionaryModel = new SystemdictionaryModel();
        systemdictionaryModel.setId(1);
        systemdictionaryModel.setSn("Test03");
        systemdictionaryModel.setTitle("测试3");
        systemdictionaryModel.setIntro("test03");
        int i = dictionaryService.updateSystemdictionary(systemdictionaryModel);
        if(i>0){
            System.out.println(i);
        }
    }
}