package com.example.dynamicdatasource.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.dynamicdatasource.entity.Student;

@DS("student")
public interface StudentMapper extends BaseMapper<Student> {
}
