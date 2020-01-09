package com.zking.P2PLoan.home.service;

import com.zking.P2PLoan.admin.service.BaseTest;
import com.zking.P2PLoan.home.model.BidModel;
import org.junit.Test;

import javax.annotation.Resource;

import java.math.BigDecimal;
import java.util.Date;

import static org.junit.Assert.*;

/**
 * create by CSQ on 2020-01-06
 */
public class IBidServiceImplTest extends BaseTest {

    @Resource
    private IBidServiceImpl bidService;

    @Resource
    private IAccountServiceImpl accountService;

    @Test
    public void addBid() {
        BidModel bidModel = new BidModel();

        BigDecimal bigDecimal = new BigDecimal(5);
        BigDecimal bigDecimal2 = new BigDecimal(800);
        bidModel.setActualRate(bigDecimal);
        bidModel.setAvailableAmount(bigDecimal2);
        bidModel.setBidrequestId(3);
        bidModel.setBidUserId(3);
        bidModel.setBidTime(new Date());
        bidModel.setBidRequestState(8);
        int i = bidService.addBid(bidModel);
        System.out.println(i);
        if(i>0){
           accountService.investment(bigDecimal2,"admin");
            System.out.println("成功!");
        }
    }

    @Test
    public void test(){
        BidModel bidModel = new BidModel();

        BigDecimal bigDecimal = new BigDecimal(5);
        BigDecimal bigDecimal2 = new BigDecimal(800);
        bidModel.setActualRate(bigDecimal);
        bidModel.setAvailableAmount(bigDecimal2);
        bidModel.setBidrequestId(3);
        bidModel.setBidUserId(3);
        bidModel.setBidTime(new Date());
        bidModel.setBidRequestState(8);
        bidService.Deduction(bidModel,"admin");
    }
}