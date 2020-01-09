package com.zking.P2PLoan.home.service;

import com.zking.P2PLoan.home.mapper.IBidMapper;
import com.zking.P2PLoan.home.model.BidModel;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * create by CSQ on 2020-01-06
 */
@Service
public class IBidServiceImpl implements IBidService {

    @Resource
    private IBidMapper iBidMapper;

    @Resource
    private IAccountServiceImpl accountService;

    @Override
    public int addBid(BidModel bidModel) {
        return iBidMapper.addBid(bidModel);
    }

    /**
     * 投资扣款的方法
     * @param bidModel
     */
    public void Deduction(BidModel bidModel,String userName){
        int i = this.addBid(bidModel);
        if(i>0){
            accountService.investment(bidModel.getAvailableAmount(),userName);
        }
    }

}
