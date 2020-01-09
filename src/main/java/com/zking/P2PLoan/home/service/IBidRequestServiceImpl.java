package com.zking.P2PLoan.home.service;

import com.zking.P2PLoan.home.mapper.IBidRequestMapper;
import com.zking.P2PLoan.home.model.BidrequestModel;
import com.zking.P2PLoan.util.BigDecimalUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;

/**
 * create by CSQ on 2020-01-06
 */
@Service
public class IBidRequestServiceImpl implements IBidRequestService {

    @Resource
    private IBidRequestMapper bidRequestMapper;

    @Override
    public List<BidrequestModel> getBidList(Integer id) {
        return bidRequestMapper.getBidList(id);
    }

    @Override
    public int updateBid(BidrequestModel bidrequestModel) {
        return bidRequestMapper.updateBid(bidrequestModel);
    }

    @Override
    public int addBid(BidrequestModel bidrequestModel) {
        return bidRequestMapper.addBid(bidrequestModel);
    }

    @Override
    public List<BidrequestModel> ReviewByBidrequest(BidrequestModel bidrequestModel) {
        return bidRequestMapper.ReviewByBidrequest(bidrequestModel);
    }

    @Override
    public int passed(BidrequestModel bidrequestModel) {
        return bidRequestMapper.passed(bidrequestModel);
    }


    /**
     * 借款的方法
     * @param id 借款的id
     */
    public void Borrow(Integer id,BigDecimal currentSums){

        if(id!=null){//如果id有值
            //查询标的信息
            List<BidrequestModel> bids = this.getBidList(id);
            //如果查询到的数据有值
           if(bids.size()>0){
               BidrequestModel bidrequestModel = new BidrequestModel();
               for (BidrequestModel b : bids){
                   bidrequestModel.setId(b.getId());
                   bidrequestModel.setVersion(b.getVersion()+1);
                   bidrequestModel.setBidCount(b.getBidCount()+1);
                   BigDecimal addition = BigDecimalUtil.Addition(currentSums, b.getCurrentSum());
                   bidrequestModel.setCurrentSum(addition);
               }
               this.updateBid(bidrequestModel);
           }
        }
    }

}
