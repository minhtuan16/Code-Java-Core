package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity_model.Teacher;

public interface TeacherRepo  extends JpaRepository<Teacher, Integer>{

}