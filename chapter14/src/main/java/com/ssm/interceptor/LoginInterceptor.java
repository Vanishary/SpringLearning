package com.ssm.interceptor;

import com.ssm.po.User;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @Author: Guotao Li
 * @DateTime: 2022/4/1 5:50 下午
 * @Description: 用户登录拦截器
 */
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        System.out.println("进入preHandle...");
        //获取请求的URL
        String url = httpServletRequest.getRequestURI();
        //允许公开访问"/toLogin"
        if (url.indexOf("/toLogin") >= 0) {
            return true;
        }
        //允许公开访问"/login"
        if (url.indexOf("/login") >= 0) {
            return true;
        }

        if (url.indexOf("/main") >= 0) {
            System.out.println("进入main");
        }
        //获取session
        HttpSession session = httpServletRequest.getSession();
        User user = (User) session.getAttribute("user_session");
        //如果user不为空，表示已登录
        if (user != null) {
            return true;
        }
        //如果user为空，表示未登录
        httpServletRequest.setAttribute("msg", "请先登录！");
        httpServletRequest.getRequestDispatcher("WEB-INF/jsp/login.jsp").forward(httpServletRequest, httpServletResponse);
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
