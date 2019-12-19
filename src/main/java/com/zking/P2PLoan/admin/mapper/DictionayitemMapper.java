package com.zking.P2PLoan.admin.mapper;

import com.zking.P2PLoan.admin.model.SystemdictionaryitemModel;

import java.util.List;

/**
 * create by CSQ on 2019-12-19
 */
public interface DictionayitemMapper {

    /**
     * 查询数据字典明细表的方法
     * @param itemModel 明细表对象
     * @return 返回查询到的list集合
     */
    List<SystemdictionaryitemModel> itemByParentId(SystemdictionaryitemModel itemModel);

    /**
     * 添加数据字典明细的方法
     * @param itemModel 明细表对象
     * @return 返回受影响的行数
     */
    int addItem(SystemdictionaryitemModel itemModel);

    /**
     * 删除数据字典的方法
     * @param id 要删除的ID
     * @return 返回受影响的行数
     */
    int delItem(int id);

    /**
     * 修改数据字典明细的方法
     * @param itemModel  明细表对象
     * @return 返回受影响的行数
     */
    int updateItem(SystemdictionaryitemModel itemModel);
}
