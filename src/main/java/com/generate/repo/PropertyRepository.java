package com.generate.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generate.entity.Property;

@Repository
public interface PropertyRepository extends JpaRepository<Property, Integer>{

}
