package com.example.sport.soccer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sport.soccer.models.User;

public interface UserRepo extends JpaRepository<User, Long> {

}
