package com.zking.P2PLoan.admin.controller;

import com.zking.P2PLoan.admin.model.LogininfoModel;
import com.zking.P2PLoan.admin.model.UserinfoModel;
import com.zking.P2PLoan.admin.service.UserInfoServiceImpl;
import com.zking.P2PLoan.util.DataProtocol;
import com.zking.P2PLoan.util.PageBean;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * create by CSQ on 2019-12-23
 */
@RestController
public class UserInfoController {

    @Resource
    private UserInfoServiceImpl userService;

    /**
     * 通过关键字获取用户名列表
     * @param pageBean 分页
     * @param UserName 用户名
     * @param RealName 用户真实姓名
     * @param UserType 用户类型
     * @return 获取到的数据列表
     */
//    @RequiresPermissions("admin:user:userList")
    @RequestMapping(value = "/admin/userList",method = RequestMethod.POST)
    public Object getUserList(PageBean pageBean, String UserName, String RealName, Integer UserType,HttpServletRequest request){

        DataProtocol data = new DataProtocol();
        List<LogininfoModel> userList = userService.getUserList(pageBean, UserName, RealName, UserType);
        if(userList.size()>0){
            data.setData(userList);
        } else {
            data.setCode(500);
            data.setMessage("数据获取失败");
        }

        return data;
    }

    /**
     * 通过id修改用户状态
     * @param id
     * @param state
     * @return
     */
//    @RequiresPermissions("admin:user:updateUser")
    @RequestMapping(value = "/admin/updateUser",method = RequestMethod.GET)
    public Object updateUser(int id,int state){
        DataProtocol data = new DataProtocol();
        System.out.println(id+""+state);
        if(id!=0){
            userService.updateUser(id,state);
            return data;
        } else {
            data.setCode(500);
            data.setMessage("操作失败");
            return data;
        }
    }

    /**
     * 添加员工账户的方法
     * @param loginModel
     * @return
     */
//    @RequiresPermissions("admin:user:addUser")
    @RequestMapping(value = "/admin/addUser",method = RequestMethod.POST)
    public Object addUser(LogininfoModel loginModel){
        DataProtocol data = new DataProtocol();

        if(loginModel!=null&&!"".equals(loginModel)){
            int i = userService.addUser(loginModel);
            if(i>0){
                return data;
            }
        } else {
            data.setCode(500);
            data.setMessage("操作失败");
            return data;
        }

        return data;
    }

}
