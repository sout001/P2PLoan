package com.zking.P2PLoan.admin.mapper;

import com.zking.P2PLoan.admin.model.LogininfoModel;
import org.apache.ibatis.annotations.Param;

/**
 * create by CSQ on 2019-12-15
 */
public interface LoginMapper {


    /**
     *通过用户名字获取用户信息
     * @param username 用户名
     * @return LogininfoModel 返回用户实体对象
     */
    LogininfoModel getUserByUserName(@Param("username") String username);
}
