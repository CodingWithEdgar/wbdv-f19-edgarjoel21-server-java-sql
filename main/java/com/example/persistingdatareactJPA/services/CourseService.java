package com.example.persistingdatareactJPA.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.persistingdatareactJPA.models.Course;
import com.example.persistingdatareactJPA.repositories.CourseRepository;

@CrossOrigin(origins="*",allowCredentials="true",allowedHeaders="*")
@RestController
public class CourseService {
  @Autowired
  CourseRepository courseRepository;
  
  @GetMapping("/api/courses")
  public List<Course> findAllCourses() {
	  return (List<Course>) courseRepository.findAll();
  }
  
  @GetMapping("/api/courses/{courseId}")
  public Course findCourseById(@PathVariable("courseId") Integer id) {
	  return courseRepository.findById(id).get();
  }
  
  @PostMapping("/api/courses")
  public Course createCourse(@RequestBody Course course) {
     return courseRepository.save(course);
     }
  
  @PutMapping("/api/courses/{courseId}")
  public Course updateCourse(@PathVariable("courseId") int id, @RequestBody Course newCourse) {
	  Course course = courseRepository.findById(id).get();
	  course.set(newCourse);
	  return courseRepository.save(course);
  }
  
  @DeleteMapping("/api/courses/{courseId}") 
  public void deleteCourse(@PathVariable("courseId") Integer id) {
	  courseRepository.deleteById(id);
  }
  }
