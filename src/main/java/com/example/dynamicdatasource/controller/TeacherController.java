package com.example.dynamicdatasource.controller;

import com.example.dynamicdatasource.entity.Teacher;
import com.example.dynamicdatasource.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/teachers")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @GetMapping
    public ResponseEntity<List<Teacher>> listTeacher(){
        List<Teacher> teacherList = teacherService.listTeacher();
        return ResponseEntity.ok(teacherList);
    }

}
