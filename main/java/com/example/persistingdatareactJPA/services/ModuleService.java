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

import com.example.persistingdatareactJPA.models.Module;
import com.example.persistingdatareactJPA.repositories.ModuleRepository;

@CrossOrigin(origins="*",allowCredentials="true",allowedHeaders="*")
@RestController
public class ModuleService {

	@Autowired
	ModuleRepository moduleRepository;
	
	@GetMapping("/api/modules")
	public List<Module> findAllmodules() {  
	   return (List<Module>) moduleRepository.findAll();
	}

	
	@GetMapping("/api/modules/{moduleId}")
	public Module findmoduleById(@PathVariable("moduleId") Integer id) {
		return moduleRepository.findById(id).get();
	}
	
	@PostMapping("/api/modules")
	public Module createmodule(@RequestBody Module module) {
		return moduleRepository.save(module);
	}
	
	@PutMapping("/api/modules/{moduleId}")
	public Module updatemodule(@PathVariable("moduleId") int id, @RequestBody Module newmodule) {
		Module module = moduleRepository.findById(id).get();
		module.set(newmodule);
		return moduleRepository.save(module);
	}
	
	@DeleteMapping("/api/modules/{moduleId}")
	public void deletemodule(@PathVariable("moduleId") int id) {
		moduleRepository.deleteById(id);
	}


}
