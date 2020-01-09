package com.zking.P2PLoan.admin.service;

import com.zking.P2PLoan.admin.mapper.RealauthMapper;
import com.zking.P2PLoan.admin.model.RealauthModel;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * create by CSQ on 2019-12-24
 */
@Service
public class RealauthServiceImpl implements RealauthService {

    /**
     * 数据持久层
     */
    @Resource
    private RealauthMapper realauthMapper;

    /**
     * 通过某个时间段来获取一些时间
     * @param StartTime
     * @param EndTime
     * @return
     */
    @Override
    public List<RealauthModel> getRealauthByDate(Date StartTime,Date EndTime){
        return realauthMapper.getRealauthByDate(StartTime,EndTime);
    }

    /**
     * 通过实名modelid修改审核状态
     * @param realauthModel
     * @return
     */
    @Override
    public int updateReala(RealauthModel realauthModel){
        return realauthMapper.updateReala(realauthModel);
    }

}
