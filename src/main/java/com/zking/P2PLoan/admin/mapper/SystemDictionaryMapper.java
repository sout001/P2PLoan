package com.zking.P2PLoan.admin.mapper;

import com.zking.P2PLoan.admin.model.SystemdictionaryModel;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * create by CSQ on 2019-12-12
 */
public interface SystemDictionaryMapper {
    /**
     * 获取数据字典数据的方法
     * @param ParamMap
     * @return 返回得到的list集合
     */
    List<SystemdictionaryModel> list(@Param("ParamMap") Map<String,Object> ParamMap);
}
