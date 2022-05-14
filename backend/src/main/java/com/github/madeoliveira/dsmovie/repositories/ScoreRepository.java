package com.github.madeoliveira.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.madeoliveira.dsmovie.entities.Score;
import com.github.madeoliveira.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK>{
	
}
