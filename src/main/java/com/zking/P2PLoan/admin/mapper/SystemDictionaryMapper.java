package com.zking.P2PLoan.admin.mapper;

import com.zking.P2PLoan.admin.model.SystemdictionaryModel;
import com.zking.P2PLoan.util.PageBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * create by CSQ on 2019-12-12
 */
public interface SystemDictionaryMapper {


    /**
     * 获取数据的方法
     * @return 返回得到的list集合
     */
    List<SystemdictionaryModel> getSystemdictionary(SystemdictionaryModel systemdictionaryModel);

    /**
     * 添加数据字典的方法
     * @param systemdictionaryModel
     * @return 受影响的行数
     */
    int addSystemdictionary(SystemdictionaryModel systemdictionaryModel);

    /**
     * 通过id删除字典数据
     * @param id
     * @return 受影响的行数
     */
    int delSystemdictionary(@Param("id") int id);

    /**
     * 通过id修改数据字典
     * @param systemdictionaryModel
     * @return
     */
    int updatedelSystemdictionary(SystemdictionaryModel systemdictionaryModel);


}
