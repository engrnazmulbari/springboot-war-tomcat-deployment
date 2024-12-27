package com.generate.configure;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.generate.entity.Property;
import com.generate.repo.PropertyRepository;

@Configuration
public class PropertyTableDBLoad {
	@Bean
	CommandLineRunner initPropertyTable(PropertyRepository propertyRepository) {
		return args->{
			System.out.println("Preloading->"+propertyRepository.save(new Property("123 Abc Rd","New Town","GA","54123")));
			System.out.println("Preloading->"+propertyRepository.save(new Property("987 xyz st", "Old Town","TN","78534")));
		};
	}
}
