package com.example.sport.soccer.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sport.soccer.models.User;
import com.example.sport.soccer.repositories.UserRepo;
import com.example.sport.soccer.services.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepo UserRepository;
	@Override
	public List<User> getAllUsers() {
		return UserRepository.findAll();
		
	}
	@Override
	public User addUser(User u) {
		return UserRepository.save(u);
		
	}
	@Override
	public User findUserById(Long id) {
		Optional<User> User = UserRepository.findById(id);
		return User.isPresent() ? User.get() : null;
		
	}
	@Override
	public void deleteUser(Long id) {
		UserRepository.deleteById(id);
		
	}
	@Override
	public User updateUser(User u) {
		return UserRepository.save(u);
		
	}

}
