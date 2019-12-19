package com.zking.P2PLoan.admin.mapper;

import com.zking.P2PLoan.admin.model.IplogModel;
import org.apache.ibatis.annotations.Param;

/**
 * create by CSQ on 2019-12-16
 */
public interface IpLogMapper {

    /**
     * 添加登录记录的方法
     * @param username
     */
    void addRecordingByLogin(@Param("username") String username);

}
