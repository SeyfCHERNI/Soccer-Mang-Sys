package com.example.sport.soccer.services;

import java.util.List;


import com.example.sport.soccer.models.User;

public interface UserService {
	public List<User> getAllUsers();
	public User addUser(User u);
	public User findUserById(Long id);
	public void deleteUser(Long id);
	public User updateUser(User u); 

}
