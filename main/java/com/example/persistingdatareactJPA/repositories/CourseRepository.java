package com.example.persistingdatareactJPA.repositories;
import org.springframework.data.repository.*;

import com.example.persistingdatareactJPA.models.Course;

public interface CourseRepository extends CrudRepository<Course, Integer> {

}
