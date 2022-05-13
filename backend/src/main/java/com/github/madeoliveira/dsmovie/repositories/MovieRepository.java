package com.github.madeoliveira.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.madeoliveira.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{
	
}
