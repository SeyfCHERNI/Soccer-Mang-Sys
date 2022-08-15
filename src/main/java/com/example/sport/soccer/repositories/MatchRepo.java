package com.example.sport.soccer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sport.soccer.models.Matche;

public interface MatchRepo extends JpaRepository<Matche, Long> {
	

}
