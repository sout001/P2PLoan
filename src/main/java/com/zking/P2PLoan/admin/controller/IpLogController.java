package com.zking.P2PLoan.admin.controller;

import com.zking.P2PLoan.admin.model.IplogModel;
import com.zking.P2PLoan.admin.service.IpLogServiceImpl;
import com.zking.P2PLoan.util.DataProtocol;
import com.zking.P2PLoan.util.PageBean;
import org.apache.shiro.SecurityUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * create by CSQ on 2019-12-22
 */
@RestController
public class IpLogController {

    @Resource
    private IpLogServiceImpl ipLogService;

    @RequestMapping(value = "admin/delIP",method = RequestMethod.DELETE)
    public Object delIP(int id){

        DataProtocol data = new DataProtocol();
        ipLogService.DelByID(id);

        return data;
    }

    @RequestMapping(value = "admin/getIpList",method = RequestMethod.POST)
    public Object getIpList(PageBean pageBean,IplogModel iplogModel){

//        System.out.println(SecurityUtils.getSubject().getPrincipal().toString());

        pageBean.setTotal(48);

        DataProtocol data = new DataProtocol();

        List<IplogModel> ipList = ipLogService.getIPList(pageBean, iplogModel);
        if(ipList.size()>0){
            data.setData(ipList);
        }

        return data;
    }

}
