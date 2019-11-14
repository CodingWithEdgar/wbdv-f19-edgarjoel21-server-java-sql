package com.example.persistingdatareactJPA.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.persistingdatareactJPA.models.Course;
import com.example.persistingdatareactJPA.repositories.CourseRepository;

@RestController
public class CourseService {
  @Autowired
  CourseRepository courseRepository;
  
  @PostMapping("/api/courses")
  public Course createCourse(@RequestBody Course course) {
     return courseRepository.save(course);
     }
  }
