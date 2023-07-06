package com.example.uwuspringapi.service;

import com.example.uwuspringapi.api.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {

    private List<Student> studentList;

    public StudentService() {
        this.studentList = new ArrayList<>();

        Student student1 = new Student(1, "Saman", 20, "saman@gmail.com");
        Student student2 = new Student(2, "Wimala", 21, "wimala@gmail.com");
        Student student3 = new Student(3, "Kamal", 19, "kamal@gmail.com");
        Student student4 = new Student(4, "Nayana", 18, "nayana@gmail.com");
        Student student5 = new Student(5, "Nimal", 22, "nimal@gmail.com");

        studentList.addAll(Arrays.asList(student1, student2, student3, student4, student5));
    }

    public Student getStudent(Integer id) {
        for (Student student : studentList) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }
}
