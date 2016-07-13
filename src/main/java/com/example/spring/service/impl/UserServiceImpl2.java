package com.example.spring.service.impl;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.spring.domain.User;
import com.example.spring.repository.UserRepository;
import com.example.spring.service.UserService;

@Component
@Service("Service2")
public class UserServiceImpl2 implements UserService, ApplicationContextAware {

	@Autowired
	ApplicationContext applicationContext;

	@Override
	public List<User> list() {
		UserRepository rep = applicationContext.getBean(UserRepository.class);
		return rep.list();
	}

	@Override
	public User get(int id) {
		UserRepository rep = applicationContext.getBean(UserRepository.class);
		return rep.get(id);
	}

	@Override
	public void save(User user) {
		UserRepository rep = applicationContext.getBean(UserRepository.class);
		rep.save(user);
	}

	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		applicationContext = arg0;
	}
	
	ApplicationContext  getApplicationContext(){
		return applicationContext;
	}

}
