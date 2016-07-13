package com.example.spring.repository.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.spring.domain.User;
import com.example.spring.repository.UserRepository;


@Component
public class UserRepositoryImpl implements UserRepository{

	@Override
	public List<User> list() {
		System.out.println("GET USER LIST");
		return new ArrayList<User>(Arrays.asList(new User("U1","U1"),new User("U2","U2")));
	}

	@Override
	public User get(int id) {
		System.out.println("GET USER BY ID");
		return new User("User","User");
	}

	@Override
	public void save(User user) {
		System.out.println("SAVE REP " + user.getFirstName());
	}

}
