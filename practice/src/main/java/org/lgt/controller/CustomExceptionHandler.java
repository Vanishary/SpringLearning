package org.lgt.controller;

import org.omg.PortableInterceptor.IORInterceptor_3_0;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.multipart.MaxUploadSizeExceededException;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author: GuoTao Li
 * @description: This is a description
 * @create: 2020年10月29日 19:54
 */
@ControllerAdvice
public class CustomExceptionHandler {
    @ExceptionHandler(MaxUploadSizeExceededException.class)
    public void uploadException(MaxUploadSizeExceededException e, HttpServletResponse resp) throws IOException{
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out  = resp.getWriter();
        out.write("上传文件大小超限");
        out.flush();
        out.close();
    }
}
