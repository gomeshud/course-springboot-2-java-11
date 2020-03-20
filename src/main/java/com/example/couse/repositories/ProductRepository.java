package com.example.couse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.couse.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	

}
