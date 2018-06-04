package com.lonntec.repository;

import com.lonntec.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,String>{
    @Query("select s from Student s")
    List<Student> findStudents();
}
