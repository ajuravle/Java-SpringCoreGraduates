package com.example.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.spring.domain.User;
import com.example.spring.repository.UserRepository;
import com.example.spring.service.UserService;

@Component
@Service("service1")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private User u;
	@Autowired
	private User u2;

	@Override
	public List<User> list() {
		// call method from UserRepository and remove throw
		return userRepository.list();
	}

	@Override
	public User get(int id) {
		// call method from UserRepository and remove throw
		return userRepository.get(id);
	}

	@Override
	public void save(User user) {
		// call method from UserRepository and remove throw
		userRepository.save(user);

		System.out.println("User1: " + u + "\nUser2: " + u2);
	}
}
