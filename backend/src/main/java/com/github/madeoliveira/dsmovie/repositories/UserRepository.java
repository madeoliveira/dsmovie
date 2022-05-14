package com.github.madeoliveira.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.madeoliveira.dsmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	User findByEmail(String email);
	
	
}
