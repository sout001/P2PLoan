package com.zking.P2PLoan.admin.service;

import com.github.pagehelper.PageHelper;
import com.zking.P2PLoan.admin.mapper.UserInfoMapper;
import com.zking.P2PLoan.admin.model.LogininfoModel;
import com.zking.P2PLoan.admin.model.UserinfoModel;
import com.zking.P2PLoan.util.PageBean;
import com.zking.P2PLoan.util.PasswordHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * create by CSQ on 2019-12-22
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Resource
    private UserInfoMapper userInfoMapper;

    /**
     * 通过关键字获取用户列表
     * @param pageBean 分页
     * @param UserName 用户名
     * @param RealName 用户真实姓名
     * @param UserType 用户类型
     * @return 返回获取到的用户列表
     */
    @Override
    public List<LogininfoModel> getUserList(PageBean pageBean, String UserName, String RealName, Integer UserType){

        if(pageBean!=null && pageBean.isPagination()){
            //设置的分页参数最终是保持在线程绑定变量中
            PageHelper.startPage(pageBean.getPage(),pageBean.getRows());
        }

        return userInfoMapper.getUserinList(UserName,RealName,UserType);
    }

    /**
     * 通过用户id修改用户状态
     * @param id
     * @param state
     */
    @Override
    public void updateUser(int id,int state){
        if(id!=0){
            userInfoMapper.updateUser(id,state);
        }
    }

    /**
     * 添加员工账户的方法的方法
     * @param loginModel
     * @return
     */
    @Override
    public int addUser(LogininfoModel loginModel){
        if(loginModel!=null&&!"".equals(loginModel)){
            String salt = PasswordHelper.createSalt();
            String credentials = PasswordHelper.createCredentials(loginModel.getPassword(), salt);
            loginModel.setSalt(salt);
            loginModel.setPassword(credentials);
        }

        return userInfoMapper.addUser(loginModel);
    }

}
