package com.student.managemt.repository;

import com.student.managemt.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository<Student,Long> {

}
