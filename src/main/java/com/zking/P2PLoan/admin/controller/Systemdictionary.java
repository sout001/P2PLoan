package com.zking.P2PLoan.admin.controller;

import com.zking.P2PLoan.admin.model.SystemdictionaryModel;
import com.zking.P2PLoan.admin.service.SystemDictionaryServiceImpl;
import com.zking.P2PLoan.util.DataProtocol;
import com.zking.P2PLoan.util.PageBean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.logging.Logger;

/**
 * create by CSQ on 2019-12-18
 */
@RestController
public class Systemdictionary {

    @Resource
    private SystemDictionaryServiceImpl systemDictionaryService;

    /**
     * 绑定数据的接口
     * @param systemdictionaryModel
     * @return
     */
    @RequestMapping(value = "/admin/sysdic")
    public Object getSystemdictionary(PageBean pageBean,SystemdictionaryModel systemdictionaryModel){
        pageBean.setPage(1);
        List<SystemdictionaryModel> systemdictionary = systemDictionaryService.getSystemdictionary(pageBean, systemdictionaryModel);
        DataProtocol data = new DataProtocol();
        data.setCode(200);
        data.setMessage("操作成功");
        data.setData(pageBean);
        data.setData(systemdictionary);
        return  data;
    }

    @RequestMapping(value = "/admin/add")
    public Object add(SystemdictionaryModel systemdictionaryModel){
        DataProtocol data = new DataProtocol();
       if(systemdictionaryModel != null && !"".equals(systemdictionaryModel)){
           int i = systemDictionaryService.addSystemdictionary(systemdictionaryModel);
           if(i>0){
                return data;
           } else {
               data.setCode(500);
               data.setMessage("操作失败");
               return data;
           }
       }
       return false;
    }

    @RequestMapping(value = "/admin/edit")
    public Object edit(SystemdictionaryModel systemdictionaryModel){
        DataProtocol data = new DataProtocol();
        if(systemdictionaryModel != null && !"".equals(systemdictionaryModel)){
            int i = systemDictionaryService.updateSystemdictionary(systemdictionaryModel);
            if(i>0){
                return data;
            } else {
                data.setCode(500);
                data.setMessage("操作失败");
                return data;
            }

        }
        return data;
    }

    @RequestMapping(value = "/admin/del",method = RequestMethod.DELETE)
    public Object del(int id){
        DataProtocol data = new DataProtocol();
        if(id>0){
            int i = systemDictionaryService.delSystemdictionary(id);
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
