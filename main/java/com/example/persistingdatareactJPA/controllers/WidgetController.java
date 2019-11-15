package com.example.persistingdatareactJPA.controllers;

import java.util.List;


import com.example.persistingdatareactJPA.models.Widget;
import com.example.persistingdatareactJPA.services.WidgetService;

public class WidgetController {
	
	WidgetService widgetService;

	public List<Widget> findAllWidgets() {
		return widgetService.findAllWidgets();
	}
	
	public Widget findWidgetById(Integer id) {
		return widgetService.findWidgetById(id);
	}
	
	public Widget createWidget(Widget widget) {
		return widgetService.createWidget(widget);
	}
	
	public Widget updateWidget(int id, Widget newWidget) {
		return widgetService.updateWidget(id, newWidget);
	}
	
	public void deleteWidget(int id) {
		widgetService.deleteWidget(id);
	}
}
