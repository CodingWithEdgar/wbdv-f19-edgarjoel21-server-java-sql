package com.example.persistingdatareactJPA.repositories;
import org.springframework.data.repository.*;

import com.example.persistingdatareactJPA.models.Faculty;

public interface FacultyRepository extends CrudRepository<Faculty, Integer> {
	
}

