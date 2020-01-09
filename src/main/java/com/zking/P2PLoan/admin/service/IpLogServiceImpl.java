package com.zking.P2PLoan.admin.service;

import com.github.pagehelper.PageHelper;
import com.zking.P2PLoan.admin.mapper.IpLogMapper;
import com.zking.P2PLoan.admin.model.IplogModel;
import com.zking.P2PLoan.admin.model.LogininfoModel;
import com.zking.P2PLoan.util.PageBean;
import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import org.slf4j.Logger;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.net.InetAddress;
import java.util.Date;
import java.util.List;

/**
 * create by CSQ on 2019-12-16
 */
@Service
public class IpLogServiceImpl implements IpLogService {

    @Resource
    private IpLogMapper ipLogMapper;


    /**
     * 记录登录的方法
     * @param iplogModel
     */
    @Override
    public void addRecordingByLogin(IplogModel iplogModel,LogininfoModel logininfoModel){

        if(logininfoModel !=null && !"".equals(logininfoModel)){
            iplogModel.setUsername(logininfoModel.getUsername());
            iplogModel.setUserType(logininfoModel.getUserType());
            iplogModel.setState(logininfoModel.getState());
            iplogModel.setLogininfoid(logininfoModel.getId());
            iplogModel.setLogintime(new Date());
            String ip = null;
            try {
                ip = InetAddress.getLocalHost().getHostAddress();
            } catch (Exception e) {
                System.out.println(e);
            }
            iplogModel.setIp(ip);
        }

        ipLogMapper.addRecordingByLogin(iplogModel,logininfoModel);
    }

    /**
     * 获取历史登录列表
     * @param pageBean
     * @param iplogModel
     * @return
     */
    @Override
    public List<IplogModel> getIPList(PageBean pageBean,IplogModel iplogModel){

        if(pageBean!=null && pageBean.isPagination()){
            //设置的分页参数最终是保持在线程绑定变量中
            PageHelper.startPage(pageBean.getPage(),pageBean.getRows());
        }

        return ipLogMapper.LogList(iplogModel);
    }

    /**
     * 删除历史登录的方法
     * @param id
     */
    @Override
    public void DelByID(int id){
        if(id>0){
            ipLogMapper.DelByID(id);
        }

    }

}
