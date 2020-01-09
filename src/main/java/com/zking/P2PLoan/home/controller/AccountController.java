package com.zking.P2PLoan.home.controller;

import com.zking.P2PLoan.home.service.IAccountServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * create by CSQ on 2020-01-06
 */
@Controller
public class AccountController {

    @Resource
    private IAccountServiceImpl accountService;

    @RequestMapping("/investment")
    public String investment(String moeny,String username){

        BigDecimal str = new BigDecimal(moeny);
        accountService.investment(str,username);

        return "";
    }

}
