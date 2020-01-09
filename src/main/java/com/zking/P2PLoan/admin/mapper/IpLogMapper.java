package com.zking.P2PLoan.admin.mapper;

import com.zking.P2PLoan.admin.model.IplogModel;
import com.zking.P2PLoan.admin.model.LogininfoModel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * create by CSQ on 2019-12-16
 */
public interface IpLogMapper {

    /**
     * 添加登录记录的方法
     * @param iplogModel
     */
    void addRecordingByLogin(IplogModel iplogModel,LogininfoModel logininfoModel);

    void DelByID(int id);

    List<IplogModel> LogList(IplogModel iplogModel);

}
