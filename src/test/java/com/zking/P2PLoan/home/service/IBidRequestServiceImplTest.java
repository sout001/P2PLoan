package com.zking.P2PLoan.home.service;

import com.zking.P2PLoan.admin.service.BaseTest;
import com.zking.P2PLoan.home.model.BidrequestModel;
import org.junit.Assert;
import org.junit.Test;

import javax.annotation.Resource;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * create by CSQ on 2020-01-06
 */
public class IBidRequestServiceImplTest extends BaseTest {

    @Resource
    private IBidRequestServiceImpl bidRequestService;

    @Test
    public void getBidList() {
        List<BidrequestModel> bidList = bidRequestService.getBidList(null);
        for (BidrequestModel bids : bidList){
            System.out.println(bids);
        }
    }

    @Test
    public void test(){
        BigDecimal add = new BigDecimal(500);
        bidRequestService.Borrow(3,add);
    }

    @Test
    public void test2(){
        //VALUES (1,1,0,0,#{bidRequestAmount},
        // 5,#{monthes2Return},0,250,0,#{title},#{description},
        // '申请',#{disableDate},#{createuserId},100,100,#{applyTime},#{publishTime});
        BidrequestModel bidrequestModel = new BidrequestModel();
        BigDecimal add = new BigDecimal(5000);
        BigDecimal add1 = new BigDecimal(0);
        byte a = 25;
//        bidrequestModel.setVersion(1);
//        bidrequestModel.setBidCount(0);
//        bidrequestModel.setCurrentSum(add1);
        bidrequestModel.setMonthes2Return(a);
        bidrequestModel.setBidRequestAmount(add);
        bidrequestModel.setTitle("测试啊");
        bidrequestModel.setDescription("我要借钱");
        bidrequestModel.setDisableDate(new Date());
        bidrequestModel.setCreateuserId(2);
        bidrequestModel.setApplyTime(new Date());
        bidrequestModel.setPublishTime(new Date());
        int i = bidRequestService.addBid(bidrequestModel);
        System.out.println(i);
    }

    @Test
    public void test3(){
        List<BidrequestModel> list = bidRequestService.ReviewByBidrequest(null);
        for(BidrequestModel b : list){
            System.out.println(b);
        }
        Assert.assertEquals(list.size(),4);
    }

    @Test
    public void test4(){
        BidrequestModel bidrequestModel = new BidrequestModel();
        byte a = 1;
        bidrequestModel.setBidRequestState(a);
        bidrequestModel.setId(1);
        bidrequestModel.setNote("测试啊");
        int i = bidRequestService.passed(bidrequestModel);
        System.out.println(i);
    }
}