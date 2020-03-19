package com.example.couse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.couse.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
	

}
