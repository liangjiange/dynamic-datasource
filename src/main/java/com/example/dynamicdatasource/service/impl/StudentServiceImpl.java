package com.example.dynamicdatasource.service.impl;

import com.example.dynamicdatasource.entity.Student;
import com.example.dynamicdatasource.mapper.StudentMapper;
import com.example.dynamicdatasource.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> listStudent() {
        return studentMapper.selectList(null);
    }
}
