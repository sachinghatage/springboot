package com.rest.example.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.rest.example.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {

	
	List<Course> list;
	
	
	public CourseServiceImpl() {
		list=new ArrayList();
		list.add(new Course(1,"java","basics of java"));
		list.add(new Course(2,"spring","rest api"));
	}


	@Override
	public List<Course> getCourses() {
		
		return list;
	}

}
