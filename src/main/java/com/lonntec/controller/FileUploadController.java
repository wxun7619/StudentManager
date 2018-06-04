package com.lonntec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Random;

@Controller
public class FileUploadController {
    @RequestMapping("/upload")
    @ResponseBody
    public String upload(@RequestParam("test")MultipartFile file){
        if(file.isEmpty()){
            return "文件为空";
        }
//        //获取文件名
        String fileName=file.getOriginalFilename();
        //获取后缀名
        String suffixName=fileName.substring(fileName.lastIndexOf("."));
        StringBuilder sb=new StringBuilder();
        Random random=new Random();
        for(int i=0;i<6;i++){
            sb.append(random.nextInt(10));
        }
        sb.append(suffixName);
        //文件上传路径
        String filePath="C://test//";
        File dest=new File(filePath+sb);
        //检测是否存在目录
        if(!dest.getParentFile().exists()){
            dest.getParentFile().mkdirs();
        }
        try {
            file.transferTo(dest);
            return "上传成功！";
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "上传失败！";
    }
}
