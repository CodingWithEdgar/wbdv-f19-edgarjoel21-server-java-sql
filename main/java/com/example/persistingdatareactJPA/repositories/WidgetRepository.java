package com.example.persistingdatareactJPA.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.persistingdatareactJPA.models.Widget;

public interface WidgetRepository  extends CrudRepository<Widget, Integer> {

}
