package com.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: Guotao Li
 * @DateTime: 2022/4/1 3:55 下午
 * @Description: TODO
 */
@Controller
public class HelloController {
    /**
     * @Author: Guotao Li
     * @DateTime: 2022/4/1 4:12 下午
     * @Params: []  
     * @Return: java.lang.String 
     * @Description: TODO
     */
    @RequestMapping("/hello")
    public String hello(){
        System.out.println("hello");
        return "success";
    }
}
