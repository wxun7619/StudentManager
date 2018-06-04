package com.lonntec.controller;

import com.lonntec.constant.Constant;
import com.lonntec.entity.Student;
import com.lonntec.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
public class StudentController {
    @Autowired
    StudentService studentService;
    @RequestMapping("/")
    public String getIndex(){
        return "welcome.html";
    }
    @RequestMapping("/getStudentList.html")
    public String getStudentList(ModelMap map){
        List<Student> list=studentService.getStudentListByName();
        map.addAttribute("list",list);
        return "studentList.html";
    }
    @RequestMapping("/addStudent.html")
    public String goAddStudent(){
        return "addStudent.html";
    }
    @RequestMapping("/addStudent.do")
    public String addStudent(Student student){
        student.setId(Constant.getUID());
        studentService.addStudent(student);
        return "redirect:getStudentList.html";
    }
    @RequestMapping("/editStudent.html")
    public String getEditStudent(String id, ModelMap map){
        Student student=studentService.getOneStudentById(id);
        map.addAttribute("student",student);
        return "editStudent.html";
    }
    @RequestMapping("/delStudent.do")
    public String delStudent(String id){
        studentService.delStudent(id);
        return "redirect:getStudentList.html";
    }
    @RequestMapping("/photo.html")
    public String photo(){
        return "photo.html";
    }
}
