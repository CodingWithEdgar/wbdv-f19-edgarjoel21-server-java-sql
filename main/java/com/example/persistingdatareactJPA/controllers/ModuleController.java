package com.example.persistingdatareactJPA.controllers;

import java.util.List;

import com.example.persistingdatareactJPA.models.Module;
import com.example.persistingdatareactJPA.services.ModuleService;

public class ModuleController {
	
	ModuleService moduleService;

	public List<Module> findAllmodules() {  
	   return moduleService.findAllmodules();
	}

	public Module findmoduleById(Integer id) {
		return moduleService.findmoduleById(id);
	}
	
	public Module createmodule(Module module) {
		return moduleService.createmodule(module);
	}
	
	public Module updatemodule(int id, Module newmodule) {
		return moduleService.updatemodule(id, newmodule);
	}
	
	public void deletemodule(int id) {
		moduleService.deletemodule(id);
	}


}
