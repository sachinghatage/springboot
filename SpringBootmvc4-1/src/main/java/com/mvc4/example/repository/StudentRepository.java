package com.mvc4.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mvc4.example.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
