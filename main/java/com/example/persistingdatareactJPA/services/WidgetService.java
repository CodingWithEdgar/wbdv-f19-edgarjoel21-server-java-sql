package com.example.persistingdatareactJPA.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.persistingdatareactJPA.models.Widget;
import com.example.persistingdatareactJPA.repositories.WidgetRepository;

@RestController
public class WidgetService {

	@Autowired
	WidgetRepository widgetRepository;
	
	@GetMapping("/api/widgets")
	public List<Widget> findAllWidgets() {
		return (List<Widget>) widgetRepository.findAll();
	}
	
	@GetMapping("/api/widgets/{widgetId}")
	public Widget findWidgetById(@PathVariable("widgetId") Integer id) {
		return widgetRepository.findById(id).get();
	}
	
	@PostMapping("/api/widgets")
	public Widget createWidget(@RequestBody Widget widget) {
		return widgetRepository.save(widget);
	}
	
	@PutMapping("/api/widgets/{widgetId}")
	public Widget updateWidget(@PathVariable("widgetId") int id, @RequestBody Widget newWidget) {
		Widget widget = widgetRepository.findById(id).get();
		widget.set(newWidget);
		return widgetRepository.save(widget);
	}
	
	@DeleteMapping("/api/widgets/{widgetId}")
	public void deleteWidget(@PathVariable("widgetId") int id) {
		widgetRepository.deleteById(id);
	}
	
	

}
