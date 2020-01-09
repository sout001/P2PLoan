package com.zking.P2PLoan.home.service;

import com.zking.P2PLoan.home.model.AccountModel;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

/**
 * create by CSQ on 2020-01-06
 */
public interface IAccountService {

    /**
     * 通过登录的用户名查询该用户的账户详情
     * @param userName 登录的用户名
     * @return 返回该用户的账户详情
     */
    AccountModel getAccountInfoByuserName(@Param("userName") String userName);

    /**
     * 修改用户可用金额的方法
     * @param balance
     * @param id
     * @return
     */
    int Transfer(@Param("balance") BigDecimal balance, @Param("id") int id);

}
