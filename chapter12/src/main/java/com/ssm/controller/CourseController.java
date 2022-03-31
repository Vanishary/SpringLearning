package com.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CourseController {
    //复杂数据绑定--绑定数组
    //向课程页面跳转
    @RequestMapping("/toCourse")
    public String toCourse() {
        return "course";
    }
    //删除课程
    @RequestMapping("/deleteCourse")
    public String deleteCourse(Integer[] ids) {
        if (ids!=null) {
            //使用输出语句模拟已经删除过程
            for (Integer id:ids) {
                System.out.println("删除了ID为" + id + "的课程");
            }
        }else {
            System.out.println("ids=null");
        }
        return "success";
    }
}
