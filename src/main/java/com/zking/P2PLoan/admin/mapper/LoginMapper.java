package com.zking.P2PLoan.admin.mapper;

import com.zking.P2PLoan.admin.model.LogininfoModel;
import org.apache.ibatis.annotations.Param;

import java.util.Set;

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

    /**
     * 通过用户名获取用户角色
     * @param userName 用户名
     * @return 角色名称集合
     */
    Set<String> getRolesByUserName(@Param("userName") String userName);

    /**
     * 通过用户名获取用户权限信息
     * @param userName 用户名
     * @return 权限集合
     */
    Set<String> getPermissionByuserName(@Param("userName") String userName);

}
