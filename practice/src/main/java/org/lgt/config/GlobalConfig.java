package org.lgt.config;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: GuoTao Li
 * @description: This is a description
 * @create: 2020年10月29日 20:36
 */
@ControllerAdvice
public class GlobalConfig {
//    @ModelAttribute(value = "info")
//    public Map<String, String> userInfo() {
//        HashMap<String, String> map = new HashMap<>();
//        map.put("username", "罗贯中");
//        map.put("gender", "男");
//        return map;
//    }

    @InitBinder("b")
    public void init(WebDataBinder binder){
        binder.setFieldDefaultPrefix("b.");
    }

    @InitBinder("a")
    public void init2(WebDataBinder binder){
        binder.setFieldDefaultPrefix("a.");
    }
}
