package com.rest.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.example.entities.Course;
import com.rest.example.services.CourseService;

@RestController
public class MyController {

	@Autowired
	private CourseService courseService;
	
	//get courses
	
	@GetMapping("/courses")
	public List<Course> getCourses(){
		
		return this.courseService.getCourses();
		}
}
