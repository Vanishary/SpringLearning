package org.lgt.component;

import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.WebRequest;

import java.util.Map;

/**
 * @author: GuoTao Li
 * @description: This is a description
 * @create: 2021年03月02日 21:52
 */
@Component
public class MyErrorAttriburte extends DefaultErrorAttributes {

    @Override
    public Map<String, Object> getErrorAttributes(WebRequest webRequest, boolean includeStackTrace) {
        Map<String, Object> errorAttributes = super.getErrorAttributes(webRequest, includeStackTrace);
        errorAttributes.put("custommsg", "出错啦!");
        errorAttributes.remove("error");
//        errorAttributes.remove("path");
        return errorAttributes;
    }
}
