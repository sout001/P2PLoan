package com.zking.P2PLoan.admin.service;

import com.zking.P2PLoan.admin.model.SystemdictionaryitemModel;
import com.zking.P2PLoan.util.PageBean;

import java.util.List;

/**
 * create by CSQ on 2019-12-19
 */
public interface DictionayitemService {

    /**
     * 模糊查询的方法
     * @param pageBean
     * @param systemdictionaryitemModel
     * @return
     */
    List<SystemdictionaryitemModel> getItemList(PageBean pageBean, SystemdictionaryitemModel systemdictionaryitemModel);

    /**
     * 添加数据字典明细的方法
     * @param systemdictionaryitemModel 对象
     * @return 受影响的行数
     */
    int addItem(SystemdictionaryitemModel systemdictionaryitemModel);

    /**
     * 删除数据字典明细的方法
     * @param id 要删除的id
     * @return 受影响的行数
     */
    int delItem(int id);

    /**
     * 修改数据字典的方法
     * @param systemdictionaryitemModel 对象
     * @return 受影响的行数
     */
    int update(SystemdictionaryitemModel systemdictionaryitemModel);
}
