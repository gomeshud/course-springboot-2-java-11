package com.example.couse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.couse.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	

}
