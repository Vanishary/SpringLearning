package com.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author: GuoTao Li
 * @description: This is a description
 * @create: 2022年03月30日 16:04
 */
@Controller
@RequestMapping(value = "/controll")
public class ControllerTest {
    @RequestMapping(value = "/annotationController")
    public String handleRequest(HttpServletRequest arg0, HttpServletResponse arg1, Model model) throws Exception {
        model.addAttribute("msg", "第一个带注解的Spring MVC程序");
        return "welcome";
    }
}
//public class ControllerTest implements Controller {
//    @Override
//    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
//        //创建ModelAndView对象
//        ModelAndView modelAndView = new ModelAndView();
//        //向模型对象中添加一个名称为msg的字符串对象
//        modelAndView.addObject("msg","第一个Spring MVC程序");
//        //设置返回的试图路径
//        modelAndView.setViewName("/WEB-INF/jsp/welcome.jsp");
//        return modelAndView;
//    }
//}
