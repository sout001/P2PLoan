package com.zking.P2PLoan.admin.controller;

import com.zking.P2PLoan.admin.model.SystemdictionaryitemModel;
import com.zking.P2PLoan.admin.service.DictionayitemServiceImpl;
import com.zking.P2PLoan.util.DataProtocol;
import com.zking.P2PLoan.util.PageBean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * create by CSQ on 2019-12-21
 */
@RestController
public class DictionayitemController {

    /**
     * 字典明细接口
     */
    @Resource
    private DictionayitemServiceImpl itemService;

    /**
     * 获取字典明细列表
     * @param item
     * @return
     */
    @RequestMapping(value = "/admin/itemlist",method = RequestMethod.POST)
    public Object ItemList(PageBean pageBean, SystemdictionaryitemModel item){

        DataProtocol data = new DataProtocol();

        List<SystemdictionaryitemModel> itemList = itemService.getItemList(pageBean, item);
        if(itemList.size()!=0){
            data.setData(itemList);
        } else {
            data.setCode(500);
            data.setMessage("数据加载失败");
        }

        return data;
    }

    /**
     * 添加数据字典的方法
     * @param item 数据字典对象
     * @return 返回受影响的行数
     */
    @RequestMapping("/admin/addItem")
    public Object addItem(SystemdictionaryitemModel item){

        DataProtocol data = new DataProtocol();

        if(item != null && !"".equals(item)){
            itemService.addItem(item);
        } else {
            data.setCode(500);
            data.setMessage("添加失败");
        }

        return data;
    }

    /**
     * 修改数据字典的方法
     * @param item 数据字典对象
     * @return 返回受影响的行数
     */
    @RequestMapping("/admin/updateItem")
    public Object updateItem(SystemdictionaryitemModel item){

        DataProtocol data = new DataProtocol();

        if(item != null && !"".equals(item)){
            itemService.update(item);
        } else {
            data.setCode(500);
            data.setMessage("修改失败");
        }

        return data;
    }

    /**
     * 删除数据字典的方法
     * @param id 数据字典对象
     * @return 返回受影响的行数
     */
    @RequestMapping("/admin/deLItem")
    public Object deLItem(int id){

        DataProtocol data = new DataProtocol();

        if(id>0&&id!=0){
            itemService.delItem(id);
        } else {
            data.setCode(500);
            data.setMessage("删除失败");
        }

        return data;
    }
}
