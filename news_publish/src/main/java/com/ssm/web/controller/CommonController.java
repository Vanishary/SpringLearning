package com.ssm.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author: Guotao Li
 * @DateTime: 2022/4/7 12:54 下午
 * @Description: 公共控制类
 */
@Controller
public class CommonController {
    @RequestMapping(value="/top.action",method= RequestMethod.GET)
    public String top(){
        return "top";
    }
    @RequestMapping(value="/left.action",method=RequestMethod.GET)
    public String left(){
        return "left";
    }
    @RequestMapping(value="/right.action",method=RequestMethod.GET)
    public String right(){
        return "right";
    }
}
