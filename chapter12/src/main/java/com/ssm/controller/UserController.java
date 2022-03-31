package com.ssm.controller;

import com.ssm.po.Banji;
import com.ssm.po.Student;
import com.ssm.po.User;
import com.ssm.po.UserVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class UserController {
    //复杂数据绑定--绑定集合
    //向用户力量修改页面跳转
    @RequestMapping("/toUserEdit")
    public String toUserEdit() {
        return "user_edit";
    }
    //接收批量修改用户方法
    @RequestMapping("/editUsers")
    public String editUser(UserVo userVo) {
        List<User> users = userVo.getUsers();
        for (User user : users) {
            if (user.getId() != null) {
                System.out.println("修改了ID为" + user.getId() + "的用户名为" + user.getUsername());
            }
        }
        return "success";
    }

        //简单数据绑定--绑定包装POJO
        //向学生查询页面跳转
//    @RequestMapping("/tofindStudentWithBanji")
//    public String tofindStudentWithBanji() {
//        return "student";
//    }
        //查询学生和班级信息
//    @RequestMapping("findStudentWithBanji")
//    public String findStudentWithBanji(Student student) {
//        Integer stu_id = student.getStu_id();
//        Banji banji = student.getBanji();
//        String banji_name = banji.getBanji_name();
//        System.out.println("banji_name=" + banji_name);
////         System.out.println("stu_id=" + stu_id);
//       return "success";
//    }

        //简单数据绑定--绑定POJO类型
        //向注册页面跳转
//    @RequestMapping("/toRegister")
//    public String registerUser() {
//        return "register";
//    }
        //接收用户注册信息
//    @RequestMapping("/registerUser")
//    public String selectUser(User user) {
//        String username = user.getUsername();
//        String password = user.getPassword();
//        System.out.println("username=" + username);
//        System.out.println("password=" + password);
//        return "success";
//    }

        //简单数据绑定--绑定简单数据类型  @RequestParam中value值为请求中字段名
//    @RequestMapping(value = "/selectUser")
//    public String selectUser(@RequestParam(value = "user_id")Integer id) {
//        System.out.println("id=" + id);
//        return "success";
//    }

        //简单数据绑定--绑定默认数据类型
//    @RequestMapping(value = "/selectUser")
//    public String selectUser(HttpServletRequest request) {
//        String id = request.getParameter("id");
//        System.out.println("id=" + id);
//        return "success";
//    }
    }
