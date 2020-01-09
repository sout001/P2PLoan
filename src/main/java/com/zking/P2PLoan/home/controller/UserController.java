package com.zking.P2PLoan.home.controller;

import com.sun.net.httpserver.HttpsServer;
import com.zking.P2PLoan.admin.model.IplogModel;
import com.zking.P2PLoan.admin.model.LogininfoModel;
import com.zking.P2PLoan.admin.model.UserinfoModel;
import com.zking.P2PLoan.admin.service.LoginServiceImpl;
import com.zking.P2PLoan.home.service.IUserServiceImpl;
import com.zking.P2PLoan.util.DataProtocol;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * create by CSQ on 2020-01-04
 */
@Controller
//@RequestMapping("/home")
public class UserController {

    @Resource
    private LoginServiceImpl loginService;

    @Resource
    private IUserServiceImpl userService;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String  Login(LogininfoModel logininfoModel, Model model, HttpServletRequest request){

        System.out.println(logininfoModel);

        HttpSession session = request.getSession();

        LogininfoModel userByUserName = loginService.getUserByUserName(logininfoModel.getUsername());
            if(userByUserName.getState()==0&&userByUserName.getState()!=null){
                Subject subject = SecurityUtils.getSubject();
                UsernamePasswordToken token = new UsernamePasswordToken(logininfoModel.getUsername(),logininfoModel.getPassword());
                try {
                    subject.login(token);
                    session.setAttribute("user",userByUserName);
                    UserinfoModel maps = userService.getUserInfo(logininfoModel.getUsername());
                    System.out.println(maps);
                    session.setAttribute("userinfo",maps);
                    return "index";
                } catch (AuthenticationException e) {
                   model.addAttribute("massage","用户名或密码有误");
                    e.printStackTrace();
                    return "login";
                }
            } else {
                model.addAttribute("massage","该账户不可用");
                return "login";
            }
    }



}
