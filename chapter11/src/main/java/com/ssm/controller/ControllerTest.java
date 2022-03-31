package com.ssm.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author: GuoTao Li
 * @description: This is a description
 * @create: 2022年03月30日 16:04
 */
public class ControllerTest implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        //创建ModelAndView对象
        ModelAndView modelAndView = new ModelAndView();
        //向模型对象中添加一个名称为msg的字符串对象
        modelAndView.addObject("msg","第一个Spring MVC程序");
        //设置返回的试图路径
        modelAndView.setViewName("/WEB-INF/jsp/welcome.jsp");
        return modelAndView;
    }
}
