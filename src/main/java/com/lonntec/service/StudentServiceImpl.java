package com.lonntec.service;

import com.lonntec.entity.Student;
import com.lonntec.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentRepository studentRepository;

    @Override
    public List<Student> getStudentListByName() {
        return studentRepository.findStudents();
    }

    @Override
    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student editStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void delStudent(String id) {

         studentRepository.deleteById(id);
    }

    @Override
    public Student getOneStudentById(String id) {
        Optional<Student> student=studentRepository.findById(id);
        if(student.isPresent()){
            return student.get();
        }
        return null;
    }
}
