package com.zking.P2PLoan.home.controller;

import com.zking.P2PLoan.admin.model.LogininfoModel;
import com.zking.P2PLoan.home.model.AccountModel;
import com.zking.P2PLoan.home.service.IAccountServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * create by CSQ on 2020-01-04
 */
@Controller
public class PageController {

    @Resource
    private IAccountServiceImpl accountService;

    @RequestMapping("/")
    public String toHome(){
        return "index";
    }

    @RequestMapping("/login")
    public String toLogin(){
        return "login";
    }

    @RequestMapping("/reg")
    public String toReg(){
        return "reg";
    }

    @RequestMapping("/borrow")
    public String toBorrow(){
        return "borrow";
    }
    @RequestMapping("/moeny")
    public String toMoeny(){
        return "borrow_moeny";
    }

    @RequestMapping("/bid")
    public String toBid(){
        return "member_bid_record";
    }

//    @RequestMapping("/market")
//    public String toMarket(){
//        return "market";
//    }


    @RequestMapping("/userA")
    public String touserA(){
        return "member_info";
    }


    @RequestMapping("/pay")
    public String toPay(){
        return "member_pay";
    }

    @RequestMapping("/userinfo")
    public String toUserinfo(HttpServletRequest request){
        HttpSession session = request.getSession();
        LogininfoModel user = (LogininfoModel)session.getAttribute("user");
        AccountModel account = accountService.getAccountInfoByuserName(user.getUsername());
        session.setAttribute("account",account);
        return "member_index";
    }

    @RequestMapping("/Tz")
    public String toTz(){
        return "member_tuan";
    }

    @RequestMapping("/Tzlist")
    public String toTzlist(){
        return "member_bid_record";
    }

    @RequestMapping("/PayList")
    public String toPayList(){
        return "member_trade";
    }

    @RequestMapping("/Autz")
    public String toAutz(){
        return "member_bid_auto";
    }
}
