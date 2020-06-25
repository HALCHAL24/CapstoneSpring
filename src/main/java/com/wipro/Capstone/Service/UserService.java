package com.wipro.Capstone.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.Capstone.Model.User;
import com.wipro.Capstone.Repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository userRepository;

	public Optional<User> findById(Long id) {
		return userRepository.findById(id);
	}

	public List<User> getAllUser() {
		return (List<User>) userRepository.findAll();
	}

	public void addUser(User us) {
		userRepository.save(us);
	}

	public void deleteUser(Long id) {
		userRepository.deleteById(id);
	}
}
