package com.zking.P2PLoan.admin.mapper;

import com.zking.P2PLoan.admin.model.RealauthModel;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * create by CSQ on 2019-12-24
 */
public interface RealauthMapper {

    /**
     * 通过时间段来获取数据
     * @param StartTime 起止时间
     * @param EndTime 截止时间
     * @return 返回查询到的数据
     */
    List<RealauthModel> getRealauthByDate(@Param("StartTime") Date StartTime,@Param("EndTime") Date EndTime);

    /**
     * 通过实名model的ID来修改审核状态
     * @param realauthModel 要修改的实名model
     * @return 返回受影响的行数
     */
    int updateReala(RealauthModel realauthModel);

}
