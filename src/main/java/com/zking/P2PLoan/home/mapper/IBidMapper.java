package com.zking.P2PLoan.home.mapper;

import com.zking.P2PLoan.home.model.BidModel;

import java.util.List;

/**
 * create by CSQ on 2020-01-06
 */
public interface IBidMapper {

    /**
     * 添加标的方法
     * @param bidModel 标模型
     * @return 返回受影响的行数
     */
    int addBid(BidModel bidModel);

}
