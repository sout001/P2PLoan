package com.zking.P2PLoan.home.service;

import com.zking.P2PLoan.admin.model.UserinfoModel;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

/**
 * create by CSQ on 2020-01-05
 */
public interface IUserService {

    UserinfoModel getUserInfo(@Param("userName") String userName);

}
