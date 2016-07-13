package com.example.spring.service.impl;

import java.util.List;

import com.example.spring.domain.User;
import com.example.spring.repository.UserRepository;
import com.example.spring.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public List<User> list() {
		//call method from UserRepository and remove throw
		return userRepository.list();
	}

	@Override
	public User get(int id) {
		//call method from UserRepository and remove throw
		return userRepository.get(id);
	}

	@Override
	public void save(User user) {
		//call method from UserRepository and remove throw
		userRepository.save(user);
	}
}
