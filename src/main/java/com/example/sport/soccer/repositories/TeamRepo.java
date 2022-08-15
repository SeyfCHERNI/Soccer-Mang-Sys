package com.example.sport.soccer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sport.soccer.models.Team;

public interface TeamRepo extends JpaRepository<Team, Long> { // long = type du clé primaire , team = nom du modele 

}
