package com.zking.P2PLoan.admin.mapper;

import com.zking.P2PLoan.admin.model.LogininfoModel;
import com.zking.P2PLoan.admin.model.UserinfoModel;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * create by CSQ on 2019-12-22
 */
public interface UserInfoMapper {

    /**
     * 通过关键字查询用户
     * @param UserName 用户名
     * @param RealName 用户真实姓名
     * @param UserType 用户类型
     * @return
     */
    List<LogininfoModel> getUserinList(@Param("UserName") String UserName, @Param("RealName") String RealName, @Param("UserType") Integer UserType);

    /**
     * 通过用户id修改用户状态
     * @param id
     * @param state
     * @return
     */
    int updateUser(int id,int state);

    /**
     * 添加员工账户
     * @param logininfoModel 登录model
     * @return 返回受影响的行数
     */
    int addUser(LogininfoModel logininfoModel);

}
