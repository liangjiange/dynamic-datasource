package com.example.dynamicdatasource.service.impl;

import com.example.dynamicdatasource.entity.Teacher;
import com.example.dynamicdatasource.mapper.TeacherMapper;
import com.example.dynamicdatasource.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherMapper teacherMapper;


    @Override
    public List<Teacher> listTeacher() {
        return teacherMapper.selectList(null);
    }
}
