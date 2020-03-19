package com.example.couse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.couse.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
	

}
