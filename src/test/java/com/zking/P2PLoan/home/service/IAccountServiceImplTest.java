package com.zking.P2PLoan.home.service;

import com.zking.P2PLoan.admin.service.BaseTest;
import com.zking.P2PLoan.home.model.AccountModel;
import org.junit.Test;

import javax.annotation.Resource;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

/**
 * create by CSQ on 2020-01-06
 */
public class IAccountServiceImplTest extends BaseTest {

    @Resource
    private IAccountServiceImpl accountService;

    @Test
    public void getAccountInfoByuserName() {
        AccountModel admin = accountService.getAccountInfoByuserName("admin");
        System.out.println(admin);
    }

    //12321400.2709

    @Test
    public void test(){
        BigDecimal bigDecimal = new BigDecimal("500.00");
        accountService.investment(bigDecimal,"admin");
    }

    @Test
    public void test2(){
        BigDecimal bigDecimal = new BigDecimal("200000000.00");
        int transfer = accountService.Transfer(bigDecimal, 3);
        System.out.println(transfer);
    }
}