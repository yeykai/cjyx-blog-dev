package com.yeykai.controller;

import com.yeykai.bean.Users;
import com.yeykai.common.Const;
import com.yeykai.common.ServerRespond;
import com.yeykai.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

/**
 * @desc：
 * @author: Qroxy
 * @QQ：1114031075
 * @时间: 2018/10/24-9:39 PM
 */
@Controller
@RequestMapping("/user/")
public class UserController {

    @Autowired
    private IUserService iUserService;
    @RequestMapping("loginVerify.do")
    @ResponseBody
    public ServerRespond<Users> loginVerify(String username, String password, HttpSession session){


        ServerRespond<Users> result = iUserService.login(username, password);
        if (result.isSuccess()) {
            session.setAttribute(Const.CURRENT_USER, result.getData());
        }
        return result;
    }
   /**
   *@desc:跳转到登录页面
   *
   *@author:Qroxy
   *
   *@date:2018/10/24 9:43 PM
   *
   *@param:[]
   *
   *@type:org.springframework.web.servlet.ModelAndView
   *
   */
    @RequestMapping("login.do")

    public ModelAndView login(){

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/html/login");
        return modelAndView;
    }
    /**
    *@desc:跳转到注册页面
    *
    *@author:Qroxy
    *
    *@date:2018/10/24 10:54 PM
    *
    *@param:
    *
    *@type:
    *
    */
    @RequestMapping("reg.do")
    public ModelAndView reg(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/html/reg");
        return modelAndView;
    }
    /**
    *@desc:用户注册接口
    *
    *@author:Qroxy
    *
    *@date:2018/10/24 11:15 PM
    *
    *@param:[user]
    *
    *@type:com.yeykai.common.ServerRespond<java.lang.String>
    *
    */

    @RequestMapping(value = "register.do", method = RequestMethod.POST)
    @ResponseBody
    public ServerRespond<String> register(Users user) {
        return iUserService.register(user);

    }
    /**
    *@desc:登出用户接口
    *
    *@author:Qroxy
    *
    *@date:2018/10/24 11:35 PM
    *
    *@param:[session]
    *
    *@type:com.yeykai.common.ServerRespond<java.lang.String>
    *
    */
    @RequestMapping(value = "logout.do", method = RequestMethod.POST)
    @ResponseBody
    public ServerRespond<String> logout(HttpSession session) {
        session.removeAttribute(Const.CURRENT_USER);
        return ServerRespond.createBySuccessMessage("登出成功");


    }
}
