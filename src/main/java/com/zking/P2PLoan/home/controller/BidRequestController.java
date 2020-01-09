package com.zking.P2PLoan.home.controller;

import com.zking.P2PLoan.home.model.BidrequestModel;
import com.zking.P2PLoan.home.service.IBidRequestServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * create by CSQ on 2020-01-06
 */
@Controller
public class BidRequestController {

    @Resource
    private IBidRequestServiceImpl bidRequestService;

    @RequestMapping("/market")
    public String loadList(Model model, HttpServletRequest request){


        HttpSession session = request.getSession();
        List<BidrequestModel> bids = bidRequestService.getBidList(null);
        if(bids!=null&&bids.size()>0){
            session.setAttribute("bids",bids);
            return "market";
        }


        return null;
    }

}
