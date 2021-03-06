package com.example.dynamicdatasource.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Student {

    private Long id;

    private String code;

    private String name;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

}
