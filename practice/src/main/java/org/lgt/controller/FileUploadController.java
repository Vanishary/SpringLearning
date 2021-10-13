package org.lgt.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * @author: GuoTao Li
 * @description: This is a description
 * @create: 2020年10月27日 20:48
 */

@RestController
public class FileUploadController {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd/");

    @PostMapping("/upload")
    public String upload(MultipartFile uploadFile, HttpServletRequest req) {
        String realPath = req.getSession().getServletContext().getRealPath("/uploadFile/");
        System.out.println("realPath:  " + realPath);
        String format = sdf.format(new Date());
        System.out.println("realPath + format:  " + realPath + format);
        File folder = new File(realPath + format);
        if (!folder.isDirectory()) {
            folder.mkdirs();
        }
        String oldName = uploadFile.getOriginalFilename();
        System.out.println("oldName:  " + oldName);
        String newName = UUID.randomUUID().toString() + oldName.substring(oldName.lastIndexOf("."), oldName.length());
        System.out.println("newName:  " + newName);
        try {
            uploadFile.transferTo(new File(folder, newName));
            return req.getScheme() + "://" + req.getServerName() + ":" + req.getServerPort() + "/uploadFile/" + format + newName;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "上传失败！";

    }

    @PostMapping("/uploads")
    public String uploads(MultipartFile[] uploadFiles, HttpServletRequest req) {
        String path = "";
        System.out.println("uploadFiles: "+uploadFiles);
        for (MultipartFile uploadFile : uploadFiles) {
            System.out.println("uploadFile: " + uploadFile);
            String realPath = req.getSession().getServletContext().getRealPath("/uploadFile/");
            System.out.println("realPath:  " + realPath);
            String format = sdf.format(new Date());
            System.out.println("realPath + format:  " + realPath + format);
            File folder = new File(realPath + format);
            if (!folder.isDirectory()) {
                folder.mkdirs();
            }
            String oldName = uploadFile.getOriginalFilename();
            System.out.println("oldName:  " + oldName);
            String newName = UUID.randomUUID().toString() + oldName.substring(oldName.lastIndexOf("."), oldName.length());
            System.out.println("newName:  " + newName);
            try {
                uploadFile.transferTo(new File(folder, newName));
                path = path + req.getScheme() + "://" + req.getServerName() + ":" + req.getServerPort() + "/uploadFile/" + format + newName + "     ";
                System.out.println("path: " + path);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        if (!path.equals("")) {
            return path;
        } else {
            return "上传失败！";
        }
    }
}
