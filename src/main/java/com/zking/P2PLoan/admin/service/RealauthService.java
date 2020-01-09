package com.zking.P2PLoan.admin.service;

import com.zking.P2PLoan.admin.model.RealauthModel;

import java.util.Date;
import java.util.List;

/**
 * create by CSQ on 2019-12-24
 */
public interface RealauthService {
    List<RealauthModel> getRealauthByDate(Date StartTime,Date EndTime);

    int updateReala(RealauthModel realauthModel);
}
