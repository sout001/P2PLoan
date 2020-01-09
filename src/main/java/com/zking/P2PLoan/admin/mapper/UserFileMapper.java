package com.zking.P2PLoan.admin.mapper;

import com.zking.P2PLoan.admin.model.UserfileModel;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * 用户资料认证
 * create by CSQ on 2019-12-24
 */
public interface UserFileMapper {

    /**
     * 通过时间段获取用户资料数据列表
     * @param StartTime 起止时间
     * @param EndTime 截至时间
     * @return 返回获取到数据
     */
    List<UserfileModel> getFileByTime(@Param("StartTime") Date StartTime, @Param("EndTime") Date EndTime);
}
