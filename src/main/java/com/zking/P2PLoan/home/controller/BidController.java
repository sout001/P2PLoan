package com.zking.P2PLoan.home.controller;

import com.zking.P2PLoan.admin.model.LogininfoModel;
import com.zking.P2PLoan.home.model.BidModel;
import com.zking.P2PLoan.home.service.IBidRequestServiceImpl;
import com.zking.P2PLoan.home.service.IBidServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;

/**
 * create by CSQ on 2020-01-07
 */
@Controller
public class BidController {

    @Resource
    private IBidServiceImpl bidService;

    @Resource
    private IBidRequestServiceImpl bidRequestService;

    @RequestMapping("/Investment")
    public String Investment(BidModel bidModel,HttpServletRequest request,Model model){

        bidModel.setBidTime(new Date());

        System.out.println(bidModel);

        HttpSession session = request.getSession();
        LogininfoModel user = (LogininfoModel) session.getAttribute("user");
        bidModel.setBidUserId(user.getId());
        if(bidModel!=null && !"".equals(bidModel)){
            bidService.Deduction(bidModel,user.getUsername());
            bidRequestService.Borrow(3,bidModel.getAvailableAmount());
        } else {
            model.addAttribute("massage","投资失败");
        }

        return null;
    }


}
