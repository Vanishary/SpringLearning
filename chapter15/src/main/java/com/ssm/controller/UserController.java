package com.ssm.controller;

import com.ssm.po.User;
import com.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: Guotao Li
 * @DateTime: 2022/4/2 12:35 上午
 * @Description: TODO
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;
    /*
     * 根据id查询用户详情
     */
    @RequestMapping("/findUserById")
    public String findUserById(Integer id,Model model){
        User user=userService.findUserById(id);
        model.addAttribute("user", user);
        //返回用户信息展示页面
        return "user";
    }
}
