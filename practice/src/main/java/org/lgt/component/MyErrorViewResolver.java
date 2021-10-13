package org.lgt.component;

import org.springframework.boot.autoconfigure.web.servlet.error.ErrorViewResolver;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @author: GuoTao Li
 * @description: This is a description
 * @create: 2021年03月02日 22:11
 */
@Component
public class MyErrorViewResolver implements ErrorViewResolver {
    @Override
    public ModelAndView resolveErrorView(HttpServletRequest request, HttpStatus status, Map<String, Object> model) {
        ModelAndView mv = new ModelAndView("errorPage");
        mv.addObject("custommsg", "出错啦！！！");
        mv.addAllObjects(model);
        return mv;
    }
}
