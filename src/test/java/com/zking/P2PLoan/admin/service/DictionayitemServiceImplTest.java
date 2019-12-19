package com.zking.P2PLoan.admin.service;

import com.zking.P2PLoan.admin.model.SystemdictionaryitemModel;
import com.zking.P2PLoan.util.PageBean;
import org.junit.Assert;
import org.junit.Test;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

/**
 * create by CSQ on 2019-12-19
 */
public class DictionayitemServiceImplTest extends BaseTest{

    @Resource
    private DictionayitemServiceImpl dictionayitemService;

    @Test
    public void getItemList() {
        PageBean pageBean = new PageBean();
        pageBean.setRows(7);
        SystemdictionaryitemModel systemdictionaryitemModel = new SystemdictionaryitemModel();
        systemdictionaryitemModel.setTitle("科");
        List<SystemdictionaryitemModel> itemList = dictionayitemService.getItemList(pageBean, systemdictionaryitemModel);
        for (SystemdictionaryitemModel s : itemList){
            System.out.println(s);
            Assert.assertEquals(itemList.size(),7);
        }

    }
}