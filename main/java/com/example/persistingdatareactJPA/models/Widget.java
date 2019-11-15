package com.example.persistingdatareactJPA.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="widgets")
public class Widget {
	@Id
	int id;
	String wtype;
	Integer height;
	Integer width;
	
	
	public Widget() {
	}


	public Widget(int id, String wtype, Integer height, Integer width) {
		super();
		this.id = id;
		this.wtype = wtype;
		this.height = height;
		this.width = width;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getWtype() {
		return wtype;
	}


	public void setWtype(String wtype) {
		this.wtype = wtype;
	}


	public Integer getHeight() {
		return height;
	}


	public void setHeight(Integer height) {
		this.height = height;
	}


	public Integer getWidth() {
		return width;
	}


	public void setWidth(Integer width) {
		this.width = width;
	}
	
	public void set(Widget widget) {
		if (widget.getWtype() != null) {
			this.setWtype(widget.getWtype());
		}
		if (widget.getHeight() != null) {
			this.setHeight(widget.getHeight());
		}
		if (widget.getWidth() != null) {
			this.setWidth(widget.getWidth());
		}
	}
	
	

	
}
