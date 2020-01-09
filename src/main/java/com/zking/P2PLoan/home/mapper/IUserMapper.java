package com.zking.P2PLoan.home.mapper;

import com.zking.P2PLoan.admin.model.UserinfoModel;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

/**
 * create by CSQ on 2020-01-05
 */
public interface IUserMapper {

    UserinfoModel getUserInfo(@Param("userName") String userName);

}
