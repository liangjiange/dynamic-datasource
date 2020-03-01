package com.example.dynamicdatasource.controller;

import com.example.dynamicdatasource.entity.Student;
import com.example.dynamicdatasource.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public ResponseEntity<List<Student>> listStudent() {
        List<Student> studentList = studentService.listStudent();
        return ResponseEntity.ok(studentList);
    }

}
