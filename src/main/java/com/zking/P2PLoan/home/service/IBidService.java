package com.zking.P2PLoan.home.service;

import com.zking.P2PLoan.home.model.BidModel;

/**
 * create by CSQ on 2020-01-06
 */
public interface IBidService {

    /**
     * 添加标的方法
     * @param bidModel 标模型
     * @return 返回受影响的行数
     */
    int addBid(BidModel bidModel);


}
