package com.mvc4.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc4.example.entity.Student;
import com.mvc4.example.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository repository;

	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return repository.save(student);
	}

	public List<Student> saveStudents(List<Student> students) {
		// TODO Auto-generated method stub
		return repository.saveAll(students);
	}

	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}
	
	

}
