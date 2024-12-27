package com.generate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generate.entity.Property;
import com.generate.service.PropertyService;

@RestController
@RequestMapping
public class PropertyController {
	@Autowired
	private PropertyService propertyService;
	
	@GetMapping("/properties")
	public List<Property> getProperties(){
		return propertyService.getProperties();
	}
	
}
