package org.lgt.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author: GuoTao Li
 * @description: This is a description
 * @create: 2020年10月25日 16:27
 */

@RestController
public class HelloController {
//    @GetMapping("/hello")
//    @ResponseBody
//    public String hello(Model model) {
//        Map<String, Object> map = model.asMap();
//        Set<String> keySet = map.keySet();
//        Iterator<String> iterator = keySet.iterator();
//        while (iterator.hasNext()) {
//            String key = iterator.next();
//            Object value = map.get(key);
//            System.out.println(key + ">>>>>>" + value);
//        }
//        return "hello spring boot!";
//    }

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        int i = 1/0;
        return "hello";
    }
}
