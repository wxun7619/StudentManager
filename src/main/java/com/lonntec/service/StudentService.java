package com.lonntec.service;

import com.lonntec.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getStudentListByName();
    Student addStudent(Student student);
    Student editStudent(Student student);
    void delStudent(String id);
    Student getOneStudentById(String id);
}
