package com.example.uwuspringapi.api.controller;

import com.example.uwuspringapi.api.model.Student;
import com.example.uwuspringapi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/student")
    public Student getStudent(@RequestParam Integer id) {
        return studentService.getStudent(id);
    }
}
