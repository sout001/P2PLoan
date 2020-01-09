package com.zking.P2PLoan.admin.controller;

import com.zking.P2PLoan.home.model.BidrequestModel;
import com.zking.P2PLoan.home.service.IBidRequestServiceImpl;
import com.zking.P2PLoan.util.DataProtocol;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 审核项目
 * create by CSQ on 2020-01-08
 */
@RestController
public class ReviewController {

    @Resource
    private IBidRequestServiceImpl bidRequestService;

    @PostMapping(value = "/admin/bid")
    public Object getBid(BidrequestModel bidrequestModel){

        DataProtocol data = new DataProtocol();


        List<BidrequestModel> bids = bidRequestService.ReviewByBidrequest(bidrequestModel);
        if(bids.size()>0){
            data.setData(bids);
            return data;
        } else {
            data.setMessage("操作失败");
            data.setCode(500);
        }
        return data;

    }

    @GetMapping(value = "/admin/passed")
    public Object Passed(BidrequestModel bidrequestModel){

        DataProtocol data = new DataProtocol();
        if(bidrequestModel!=null && !"".equals(bidrequestModel)){
            int i = bidRequestService.passed(bidrequestModel);
            if(i>0){
                return data;
            } else {
                data.setCode(500);
                data.setMessage("操作失败");
            }
        }

        return data;
    }

}
