package com.example.persistingdatareactJPA.controllers;

import java.util.List;


import org.springframework.web.bind.annotation.PathVariable;


import com.example.persistingdatareactJPA.models.Course;
import com.example.persistingdatareactJPA.services.CourseService;

public class CourseController {
	
	  CourseService courseService;

	  public List<Course> findAllCourses() {
		  return courseService.findAllCourses();
	  }
	  
	  public Course findCourseById(Integer id) {
		  return courseService.findCourseById(id);
	  }
	  
	  public Course createCourse(Course course) {
	     return courseService.createCourse(course);
	     }
	  
	  public Course updateCourse(int id, Course newCourse) {
		  return courseService.updateCourse(id, newCourse);
	  }
	  
	  public void deleteCourse(@PathVariable("courseId") Integer id) {
		  courseService.deleteCourse(id);
	  }
	  
}
