package com.zking.P2PLoan.admin.service;

import com.zking.P2PLoan.admin.model.RealauthModel;
import org.junit.Test;

import javax.annotation.Resource;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * create by CSQ on 2019-12-24
 */
public class RealauthServiceImplTest extends BaseTest {

    @Resource
    private RealauthServiceImpl realauthService;

    @Test
    public void getRealauthByDate() {
        Date AuditTime = new Date();
        List<RealauthModel> realauthByDate = realauthService.getRealauthByDate(null,null);
        for (RealauthModel s : realauthByDate){
            System.out.println(s);
        }

    }

    @Test
    public void updateReala(){
        RealauthModel realauthModel = new RealauthModel();
        realauthModel.setId(1);
        byte b = 0;
        realauthModel.setState(b);
        int i = realauthService.updateReala(realauthModel);
        System.out.println(i);

    }
}