package com.ssm.controller;

import com.ssm.po.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

/**
 * @Author: Guotao Li
 * @DateTime: 2022/4/1 5:39 下午
 * @Description: TODO
 */
@Controller
public class UserController {
    /**
     * @Author: Guotao Li
     * @DateTime: 2022/4/1 5:40 下午
     * @Params: []
     * @Return: java.lang.String
     * @Description: 向用户登录页面跳转
     */
    @RequestMapping(value = "/toLogin", method = RequestMethod.GET)
    public String toLogin() {
        return "login";
    }

    /**
     * @Author: Guotao Li
     * @DateTime: 2022/4/1 5:47 下午
     * @Params: [user, model, httpSession]
     * @Return: java.lang.String
     * @Description: 用户登录
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(User user, Model model, HttpSession httpSession) {
        String username = user.getUsername();
        String password = user.getPassword();
        //模拟从数据库获取用户名和密码
        if (username != null && !username.equals("") && username.equals("wujit")) {
            if (password != null && !password.equals("") && password.equals("123456")) {
                //用户存在，将用户信息报错在session中，并复位向到主页
                httpSession.setAttribute("user_session", user);
                return "redirect:main";
            }
        }
        //用户不存在，添加错误信息到model中，并跳转到登录页面
        model.addAttribute("msg", "用户名或密码错误，请重新登录");
        return "login";
    }

    /**
     * @Author: Guotao Li
     * @DateTime: 2022/4/1 5:47 下午
     * @Params: []
     * @Return: java.lang.String
     * @Description: 向管理页跳转
     */
    @RequestMapping(value = "/main")
    public String toMain() {
        return "main";
    }

    /**
     * @Author: Guotao Li
     * @DateTime: 2022/4/1 5:49 下午
     * @Params: [httpSession]
     * @Return: java.lang.String
     * @Description: 退出
     */
    @RequestMapping(value = "logout")
    public String logout(HttpSession httpSession) {
        httpSession.invalidate();
        return "redirect:toLogin";
    }
}

