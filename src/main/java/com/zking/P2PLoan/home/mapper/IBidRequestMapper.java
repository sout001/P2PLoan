package com.zking.P2PLoan.home.mapper;

import com.zking.P2PLoan.home.model.BidrequestModel;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

/**
 * create by CSQ on 2020-01-06
 */
public interface IBidRequestMapper {

    /**
     * 查询标的方法
     * @return
     */
    List<BidrequestModel> getBidList(@Param("id") Integer id );


    /**
     * 修改借款信息的方法
     * @return 受影响的行数
     */
    int updateBid(BidrequestModel bidrequestModel);

    /**
     * 借款的方法
     * @param bidrequestModel 借款模型
     * @return 受影响的行数
     */
    int addBid(BidrequestModel bidrequestModel);

    /**
     * 查询待审核标的方法
     * @param bidrequestModel 借款模型
     * @return 返回查询到的数据
     */
    List<BidrequestModel> ReviewByBidrequest(BidrequestModel bidrequestModel);

    /**
     * 审核标的方法
     * @param bidrequestModel
     * @return
     */
    int passed(BidrequestModel bidrequestModel);

}
