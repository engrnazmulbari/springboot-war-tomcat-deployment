package com.generate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generate.entity.Property;
import com.generate.repo.PropertyRepository;

@Service
public class PropertyService {
	@Autowired
	private PropertyRepository propertyRepository;
	
	public List<Property> getProperties(){
		return propertyRepository.findAll();
	}
}
