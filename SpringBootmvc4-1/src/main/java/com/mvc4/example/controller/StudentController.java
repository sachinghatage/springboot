package com.mvc4.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.mvc4.example.entity.Student;
import com.mvc4.example.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService service;
	
	
	@PostMapping("/addStudent")
	public Student addStudent(@RequestBody Student student) {
		return service.saveStudent(student);
	}
	
	@PostMapping("/addStudents")
	public List<Student> addStudents(@RequestBody List<Student> students){
		return service.saveStudents(students);
	}
	
	@GetMapping("/students")
	public List<Student> findAllStudents(){
		return service.getStudents();
	}
	
	
	
	
	
	
	

}
