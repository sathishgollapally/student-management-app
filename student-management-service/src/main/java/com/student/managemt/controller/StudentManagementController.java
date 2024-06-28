package com.student.managemt.controller;


import com.student.managemt.entity.Student;
import com.student.managemt.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentManagementController {

    @Autowired
    private StudentService studentService;

    @GetMapping("test")
    public String hello() {
        return "hello";
    }

    @PostMapping
    public void registerStudent(@RequestBody Student student) {
        studentService.saveStudent(student);
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

}

