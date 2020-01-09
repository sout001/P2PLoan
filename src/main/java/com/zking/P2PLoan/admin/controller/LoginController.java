package com.zking.P2PLoan.admin.controller;

import com.zking.P2PLoan.admin.model.IplogModel;
import com.zking.P2PLoan.admin.model.LogininfoModel;
import com.zking.P2PLoan.admin.service.IpLogServiceImpl;
import com.zking.P2PLoan.admin.service.LoginServiceImpl;
import com.zking.P2PLoan.util.DataProtocol;
import okhttp3.internal.http2.ErrorCode;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.jboss.jandex.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


/**
 * 后台用户接口
 * create by CSQ on 2019-12-15
 */
@RestController
public class LoginController {

    /**
     * 日志对象
     */
    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Resource
    private LoginServiceImpl loginService;

    @Resource
    private IpLogServiceImpl ipLogService;

    /**
     * 通过用户登录的方法
     * @param logininfoModel
     * @return
     */
    @RequestMapping(value = "/admin/login",method = RequestMethod.POST)
    public Object login(LogininfoModel logininfoModel){

        DataProtocol data = new DataProtocol();
        LogininfoModel userByUserName = loginService.getUserByUserName(logininfoModel.getUsername());
        if(userByUserName.getUserType()!=null&&userByUserName.getUserType()==1){
            if(userByUserName.getState()==0&&userByUserName.getState()!=null){
                Subject subject = SecurityUtils.getSubject();
                UsernamePasswordToken token = new UsernamePasswordToken(logininfoModel.getUsername(),logininfoModel.getPassword());
                try {
                    subject.login(token);
                    data.setData(token);
                    IplogModel iplog = new IplogModel();
                    logger.info("登录成功："+userByUserName.getUsername());
                    ipLogService.addRecordingByLogin(iplog,userByUserName);
                } catch (AuthenticationException e) {
                    data.setCode(DataProtocol.FAIL);
                    data.setMessage("用户名或密码有误");
                    logger.info(e.getMessage());
                    e.printStackTrace();
                }
            } else {
                data.setCode(400);
                data.setMessage("账户已停用");
            }
        } else {
            data.setCode(300);
            data.setMessage("权限不足");
        }

        return data;
    }

    @RequestMapping(value = "/admin/logout",method = RequestMethod.GET)
    public Object logout(){
        DataProtocol data = new DataProtocol();
        Subject subject = SecurityUtils.getSubject();
        boolean authenticated = subject.isAuthenticated();
        System.out.println(authenticated);
        if(!subject.isAuthenticated()){
            subject.logout();
        } else {
            data.setCode(202);
            data.setMessage("请先登录在进行此操作");
        }
        return data;
    }

}
