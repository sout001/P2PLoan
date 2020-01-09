package com.zking.P2PLoan.admin.controller;

import com.zking.P2PLoan.admin.model.RealauthModel;
import com.zking.P2PLoan.admin.service.RealauthServiceImpl;
import com.zking.P2PLoan.util.DataProtocol;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * create by CSQ on 2019-12-24
 */
@RestController
public class RealauthController {

    @Resource
    private RealauthServiceImpl realauthService;

    @RequestMapping(value = "/admin/realaList",method = RequestMethod.POST)
    public Object getReala(Date StartTime, Date EndTime){
        DataProtocol data = new DataProtocol();
        System.out.println("时间分别是:"+StartTime+"end"+EndTime);
        List<RealauthModel> realauthByDate = realauthService.getRealauthByDate(StartTime, EndTime);
        if(realauthByDate.size()>0){
            data.setData(realauthByDate);
            return data;
        } else {
            data.setCode(500);
            data.setMessage("查询失败");
        }

        return null;
    }

    @RequestMapping(value = "/admin/realaUpdate",method = RequestMethod.GET)
    public Object updateReala(RealauthModel realauthModel){
        DataProtocol data = new DataProtocol();

        if(realauthModel!=null&&!"".equals(realauthModel)){
            int i = realauthService.updateReala(realauthModel);
            if(i>0){
                return data;
            } else {
                data.setCode(500);
                data.setMessage("操作失败");
            }
        } else {
            data.setCode(500);
            data.setMessage("操作失败");
            return data;
        }
        return data;
    }
}
