package com.example.sport.soccer.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sport.soccer.models.User;
import com.example.sport.soccer.services.UserService;

@CrossOrigin("*") 
@RestController
@RequestMapping("api/user")
public class UserController {
	@Autowired //injection de dependance
	private UserService UserService; // instance de la service UserService nommé userService
	@GetMapping("")
	public List<User> getAllMatches() {
		return UserService.getAllUsers();
	}
	@PostMapping("")
	public User addUser(@RequestBody User u) {
	    return UserService.addUser(u);
	}
	@PutMapping("/{id}")
	public User updateUser(@PathVariable Long id ,@RequestBody User u) {
	return UserService.updateUser(u);
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
	UserService.deleteUser(id);
	}
	@GetMapping("/{id}")
	public User findUserById(@PathVariable Long id) {
		return UserService.findUserById(id);
	}

}
